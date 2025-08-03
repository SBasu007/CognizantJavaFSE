import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const result = (parseFloat(rupees) / 90).toFixed(2); 
    alert(`Converting to Euro: Amount is €${result}`)
  };

  return (
    <div>
      <h3 style={{color:"green"}}>Currency Convertor (INR -> EUR)</h3>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          placeholder="Enter INR"
        />
        <button type="submit">Convert</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;