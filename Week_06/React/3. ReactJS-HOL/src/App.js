import { CalculateScore } from "../src/Components/CalculateScore";

function App() {
  return (
    <div>
      <CalculateScore Name={"Robert Satyam D Cruze"}
                      School={"St. Xavier's Collegiate School"}
                      total={85}
                      goal={100} />
    </div>
  );
}

export default App;
