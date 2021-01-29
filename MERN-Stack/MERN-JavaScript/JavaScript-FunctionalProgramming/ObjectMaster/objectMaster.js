const pokémon = Object.freeze([
    { "id": 1,   "name": "Bulbasaur",  "types": ["poison", "grass"] },
    { "id": 5,   "name": "Charmeleon", "types": ["fire"] },
    { "id": 9,   "name": "Blastoise",  "types": ["water"] },
    { "id": 12,  "name": "Butterfree", "types": ["bug", "flying"] },
    { "id": 16,  "name": "Pidgey",     "types": ["normal", "flying"] },
    { "id": 23,  "name": "Ekans",      "types": ["poison"] },
    { "id": 24,  "name": "Arbok",      "types": ["poison"] },
    { "id": 25,  "name": "Pikachu",    "types": ["electric"] },
    { "id": 37,  "name": "Vulpix",     "types": ["fire"] },
    { "id": 52,  "name": "Meowth",     "types": ["normal"] },
    { "id": 63,  "name": "Abra",       "types": ["psychic"] },
    { "id": 67,  "name": "Machamp",    "types": ["fighting"] },
    { "id": 72,  "name": "Tentacool",  "types": ["water", "poison"] },
    { "id": 74,  "name": "Geodude",    "types": ["rock", "ground"] },
    { "id": 87,  "name": "Dewgong",    "types": ["water", "ice"] },
    { "id": 98,  "name": "Krabby",     "types": ["water"] },
    { "id": 115, "name": "Kangaskhan", "types": ["normal"] },
    { "id": 122, "name": "Mr. Mime",   "types": ["psychic"] },
    { "id": 133, "name": "Eevee",      "types": ["normal"] },
    { "id": 144, "name": "Articuno",   "types": ["ice", "flying"] },
    { "id": 145, "name": "Zapdos",     "types": ["electric", "flying"] },
    { "id": 146, "name": "Moltres",    "types": ["fire", "flying"] },
    { "id": 148, "name": "Dragonair",  "types": ["dragon"] }
]);
//a list of pokémon that have names that start with the letter "B"
const bListPkmn = pokémon.filter(p => p.name[0] === "B");
//an array of just the ids
const pkmnIds = pokémon.map(p => p.id);
console.log("A list of pokémon that have names that start with the letter B");
console.log(bListPkmn);
console.log("An array of just the ids");
console.log(pkmnIds);
//an array of pokémon objects where the id is evenly divisible by 3
const pkmIdsDiviedByThree = pokémon.filter( p => p.id %3 === 0 );
console.log("An array of pokémon objects where the id is evenly divisible by 3");
console.log(pkmIdsDiviedByThree);
//an array of pokémon objects that are "fire" type
const pkmObjectHaveTypeFire = pokémon.filter(p => p.types == "fire");
console.log("An array of pokémon objects that are fire type");
console.log(pkmObjectHaveTypeFire);
//an array of pokémon objects that have more than one type
const pkmHaveMoreThanOneType = pokémon.filter(p => p.types.length > 1);
console.log("An array of pokémon objects that have more than one type");
console.log(pkmHaveMoreThanOneType);
//an array with just the names of the pokémon
const pkmnNames = pokémon.map(p => p.name);
console.log("An array with just the names of the pokémon");
console.log(pkmnNames);
//an array with just the names of pokémon with an id greater than 99
const pkmnNamesWithIdGraterThan99= pokémon.filter(p => p.id > 99).map(p => p.name);
console.log("An array with just the names of pokémon with an id greater than 99");
console.log(pkmnNamesWithIdGraterThan99);
//an array with just the names of the pokémon whose only type is poison
const pkmNamesWithTypePoison = pokémon.filter(p => p.types.includes("poison")).map(p => p.name);
console.log("An array with just the names of the pokémon whose only type is poison");
console.log(pkmNamesWithTypePoison);
//an array containing just the first type of all the pokémon whose second type is "flying"
const pkmFirstTypeThatHaveSecondTypeFlying = pokémon.filter(p => p.types[1] == "flying").map(p =>p.types[0]);
console.log("An array containing just the first type of all the pokémon whose second type is flying");
console.log(pkmFirstTypeThatHaveSecondTypeFlying);
//a count of the number of pokémon that are "normal" type
const count = pokémon.filter(p => p.types.includes("normal")).length;
console.log("A count of the number of pokémon that are normal type equals:" +count);


