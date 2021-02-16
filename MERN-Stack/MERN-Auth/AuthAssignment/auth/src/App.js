import './App.css';
import Root from './components/Root';
import Success from './components/Success';
import {Router,navigate} from'@reach/router';


function App() {
  return (
    <div className="App">
      <Router>
      <Root path ='/'/>
      <Success path='/success'/>
      </Router>
     
    </div>
  );
}

export default App;
