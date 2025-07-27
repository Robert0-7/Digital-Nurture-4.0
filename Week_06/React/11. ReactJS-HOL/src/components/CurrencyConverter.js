import React, { useState } from 'react';

function CurrencyConverter() {
  const [amount, setAmount] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const rupeesAmount = amount * 80; // 1 Euro = 80 Rupees
    alert(`Converted ${amount} Euro to ${rupeesAmount} Rupees`);
  };

  return (
    <div>
      <div>
        <label>Amount: </label>
        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
      </div>
      <div>
        <label>Currency: </label>
        <input type="text" value="Euro" disabled />
      </div>
      <button type="submit" onClick={handleSubmit}>Convert</button>
    </div>
  );
}

export default CurrencyConverter;
