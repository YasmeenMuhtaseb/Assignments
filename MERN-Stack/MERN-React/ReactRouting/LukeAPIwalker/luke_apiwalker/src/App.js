import './App.css';
import {Router,navigate} from '@reach/router';
import Root from './components/Root';
import Planet from './components/Planet';
import People from './components/People';
import {useState} from 'react';
import axios from 'axios';
import ErrorOut from './components/ErrorOut';

function App() {
  const [input,setInput] = useState('');
  const [errorOutput,setErrorOutput]=useState('');
  const dataHandler= (data,id)=>{
    axios.get(`https://swapi.dev/api/${data}/${id}/`).then(response => {
      setInput(response.data); 
      navigate(`/${data}/${id}`);
    }) .catch(() => {
        setErrorOutput('an error occured');
        navigate(`/error`);
    })
  }
  return (
    <div className="App">
      <Root data={dataHandler}/>
      <Router>
        <Planet displayData={input} path="/planets/:id/" />
        <People displayData={input} path="/people/:id/" />
        <ErrorOut displayData={errorOutput} path="/error"/>
      </Router>
    </div>
  );
}

export default App;

