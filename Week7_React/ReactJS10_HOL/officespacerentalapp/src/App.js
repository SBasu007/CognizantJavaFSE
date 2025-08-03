import logo from './logo.svg';
import './App.css';

function App() {
  const element = "Office Space"
  const jsatt = <img src="https://cdn.sanity.io/images/uqxwe2qj/production/62db3c671745e98cb27690dff96f8033d2bb7f35-2048x1010.jpg" width="25%" height="25%" alt="office_space" />
  const items = [{ Name: "DBS", Rent: 50000, Address: "Chennai" }, { Name: "WeWork", Rent: 72000, Address: "Mumbai" }, { Name: "SmartWorks", Rent: 48000, Address: "Kolkata" }]
  return (
    <div className="App">
      <h1>{element}, at Affordable Range</h1>
      {jsatt}
      {items.map((ItemName) => (
        <div>
          <h1>Name: {ItemName.Name}</h1>
          <h3 style={{color:(ItemName.Rent<60000)?"red":"green"}}>Rent: Rs. {ItemName.Rent}</h3>
          <h3>Address: {ItemName.Address}</h3>
        </div>
      )
      )}
    </div>
  );
}

export default App;
