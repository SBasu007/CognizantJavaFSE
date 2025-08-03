import React from 'react';

function WelcomeButton() {
  const sayWelcome = (msg) => {
    alert("Message: " + msg);
  };

  return (
    <button onClick={() => sayWelcome("welcome")}>Say Welcome</button>
  );
}

export default WelcomeButton;