import React, {useState,useEffect} from 'react';

const Pokemon = (props) => {
    const [pokemon, setPokemon] = useState([]);
    const handlePokemon = () => {
        fetch('https://pokeapi.co/api/v2/pokemon/?limit=807')
            .then(response => response.json())
            .then(response => setPokemon(response.results))
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
