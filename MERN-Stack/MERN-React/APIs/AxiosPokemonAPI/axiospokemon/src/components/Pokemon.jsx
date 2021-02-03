import React, {useState,useEffect} from 'react';
import axios from 'axios';
const Pokemon = (props) => {
    const [pokemon, setPokemon] = useState([]);
    const handlePokemon = () => {
        axios.get('https://pokeapi.co/api/v2/pokemon/?limit=807')
            .then(response => setPokemon(response.data.results))
    };

    return (
        <div>
            <button onClick ={handlePokemon}>Get Pokemon</button>
            {pokemon.length > 0 && pokemon.map((pokemon)=>{
                return (<div>{pokemon.name}</div>)
            })}
        </div>
    )
}

export default Pokemon