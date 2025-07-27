// src/components/ListofPlayers.js

import React from 'react';

const ListofPlayers = ({ players }) => {
  return (
    <ul>
      {players.map((player, index) => (
        <li key={index}>{player.name} {player.score}</li>
      ))}
    </ul>
  );
};

const Scorebelow70 = ({ players }) => {
  const below70 = players.filter(player => player.score < 70);
  return (
    <ul>
      {below70.map((player, index) => (
        <li key={index}>{player.name} {player.score}</li>
      ))}
    </ul>
  );
};

const players = [
  { name: "Mr. Jack", score: 50 },
  { name: "Mr. Michael", score: 70 },
  { name: "Mr. John", score: 40 },
  { name: "Mr. Ann", score: 61 },
  { name: "Mr. Elisabeth", score: 61 },
  { name: "Mr. Sachin", score: 95 },
  { name: "Mr. Dhoni", score: 100 },
  { name: "Mr. Virat", score: 84 },
  { name: "Mr. Jadeja", score: 64 },
  { name: "Mr. Raina", score: 75 },
  { name: "Mr. Rohit", score: 80 },
];

export { ListofPlayers, Scorebelow70, players };
