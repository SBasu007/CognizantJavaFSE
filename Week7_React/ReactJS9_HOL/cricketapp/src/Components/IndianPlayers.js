import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ['Virat', 'Rahul', 'Pant', 'Jadeja', 'Shami'];
  const evenTeam = ['Rohit', 'Shreyas', 'Bumrah', 'Surya', 'Gill'];

  const [virat, rahul, pant, ...others] = oddTeam;
  const [rohit, ...rest] = evenTeam;

  const T20players = ['Dhoni', 'Kohli'];
  const RanjiTrophy = ['Rahane', 'Pujara'];
  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {[virat, rahul, pant, ...others].map((name, index) => (
          <li key={index}>{name}</li>
        ))}
      </ul>
      <hr/>
      <h2>Even Team Players</h2>
      <ul>
        {[rohit, ...rest].map((name, index) => (
          <li key={index}>{name}</li>
        ))}
      </ul>
      <hr/>
      <h2>Merged Team (T20 + Ranji)</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
