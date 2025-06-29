package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub getData() method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock and call service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Step 4: Assert result is what we stubbed
        assertEquals("Mock Data", result);
    }
}
