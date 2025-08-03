import React from 'react';

function SyntheticEvent() {
  const handleClick = (event) => {
    console.log("Synthetic Event:", event);
    alert("I was clicked");
  };

  return (
    <button onClick={handleClick}>Click Me</button>
  );
}

export default SyntheticEvent;