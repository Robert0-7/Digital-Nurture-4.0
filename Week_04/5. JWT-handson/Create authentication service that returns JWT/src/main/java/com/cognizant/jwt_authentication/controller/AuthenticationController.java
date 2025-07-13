package com.cognizant.jwt_authentication.controller;

import com.cognizant.jwt_authentication.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @RequestMapping(value = "/authenticate", method = RequestMethod.GET)
    public ResponseEntity<?> createAuthenticationToken(HttpServletRequest request) {
        String header = request.getHeader("Authorization"); // Basic dXNlcjpwd2Q=
        if (header == null || !header.startsWith("Basic ")) {
            return ResponseEntity.status(401).body("Missing or invalid Authorization header");
        }

        String[] credentials = extractCredentials(header);
        String username = credentials[0];
        String password = credentials[1];

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(401).body("Incorrect username or password");
        }

        final String jwt = jwtUtil.generateToken(username);
        return ResponseEntity.ok("{\"token\":\"" + jwt + "\"}");
    }

    private String[] extractCredentials(String header) {
        String base64Credentials = header.substring("Basic ".length());
        byte[] decoded = Base64.getDecoder().decode(base64Credentials);
        return new String(decoded).split(":", 2);
    }
}
