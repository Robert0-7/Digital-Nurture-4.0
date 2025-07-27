import React, { useState } from 'react';
import './App.css';
import CurrencyConverter from './components/CurrencyConverter';

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("Hello Member!!");
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handlePress = () => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h2>Counter: {count}</h2>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      
      <button onMouseDown={handlePress}>Click on me</button>

      <h1>Currency Converter!!!</h1>
      <CurrencyConverter />
    </div>
  );
}

export default App;
