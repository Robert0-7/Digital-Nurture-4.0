// src/components/IndianPlayers.js

import React from 'react';

const IndianTeam = ["Sachin1", "Dhoni2", "Virat3", "Rohit4", "Yuvraj5", "Raina6"];
const IndianPlayers = [
  ...["Mr. First Player", "Mr. Second Player", "Mr. Third Player"],
  ...["Mr. Fourth Player", "Mr. Fifth Player", "Mr. Sixth Player"],
];

const OddPlayers = ({ IndianTeam }) => {
  const odd = IndianTeam.filter((_, index) => index % 2 === 0);
  const labels = ["First", "Third", "Fifth"];
  return (
    <ul>
      {odd.map((player, index) => (
        <li key={index}>{labels[index]} : {player}</li>
      ))}
    </ul>
  );
};

const EvenPlayers = ({ IndianTeam }) => {
  const even = IndianTeam.filter((_, index) => index % 2 !== 0);
  const labels = ["Second", "Fourth", "Sixth"];
  return (
    <ul>
      {even.map((player, index) => (
        <li key={index}>{labels[index]} : {player}</li>
      ))}
    </ul>
  );
};

const ListofIndianPlayers = ({ IndianPlayers }) => (
  <ul>
    {IndianPlayers.map((player, index) => (
      <li key={index}>{player}</li>
    ))}
  </ul>
);

export { IndianTeam, IndianPlayers, OddPlayers, EvenPlayers, ListofIndianPlayers };
