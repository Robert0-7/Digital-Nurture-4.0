// src/App.js

import React from 'react';
import {
  ListofPlayers,
  Scorebelow70,
  players
} from './components/ListofPlayers';

import {
  IndianTeam,
  IndianPlayers,
  OddPlayers,
  EvenPlayers,
  ListofIndianPlayers
} from './components/IndianPlayers';


function App() {
  const flag = false; // Set true or false to test each output

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <div>
          <h1>Indian Team</h1>
          <h1>Odd Players</h1>
          <OddPlayers IndianTeam={IndianTeam} />
          <hr />
          <h1>Even Players</h1>
          <EvenPlayers IndianTeam={IndianTeam} />
        </div>
        <hr />
        <div>
          <h1>List of Indian Players Merged:</h1>
          <ListofIndianPlayers IndianPlayers={IndianPlayers} />
        </div>
      </div>
    );
  }
}

export default App;
