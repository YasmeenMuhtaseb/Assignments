import HeaderComponent from './components/HeaderComponent.jsx'
import './App.css';
import MessageFormComponent from './components/MessageFormComponent.jsx';
import MessageDisplayComponent from './components/MessageDisplayComponent.jsx';

function App() {
  return (
    <div className="App">
      <HeaderComponent/>
      <MessageFormComponent/>
      <MessageDisplayComponent/>
    </div>
  );
}

export default App;
