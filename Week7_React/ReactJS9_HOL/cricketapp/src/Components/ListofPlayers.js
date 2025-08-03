import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 85 },
    { name: 'Rohit', score: 40 },
    { name: 'Rahul', score: 75 },
    { name: 'Shreyas', score: 55 },
    { name: 'Pant', score: 90 },
    { name: 'Jadeja', score: 65 },
    { name: 'Bumrah', score: 45 },
    { name: 'Shami', score: 30 },
    { name: 'Surya', score: 100 },
    { name: 'Gill', score: 70 },
    { name: 'Kuldeep', score: 50 }
  ];

  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
      <hr/>
      <h3>Players with score below 70</h3>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;