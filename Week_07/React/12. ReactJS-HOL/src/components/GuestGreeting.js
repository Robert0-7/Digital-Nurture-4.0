import React from 'react';

function GuestGreeting() {
  return (
    <div>
      <h1>Please sign up.</h1>
      <div className="flight-details">
        <h1 className="guest-heading">This is the Guest Page</h1>
        <p>Browse available flights (login required to book)</p>
      </div>
    </div>
  );
}

export default GuestGreeting;
