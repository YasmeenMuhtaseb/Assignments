import React from 'react';
import { Router } from '@reach/router';
import Home from './components/Home';
import Word from './components/Word';
import StyleWord from './components/StyleWord';
import './App.css';
function App() {
  return (
    <div className="App">
      <Router>
        <Home path="/home"/>
        <Word path="/:input"/>
        <StyleWord path="/:input/:bgcolor/:wordcolor"/>
      </Router>
    </div>
  );
}
export default App;