//1
console.log(hello);                                   
var hello = 'world'; 
//declare the var hello
//log will be undefined
//will assign hello variable to "world"
//2
var needle = 'haystack';
test();
function test(){
    var needle = 'magnet';
    console.log(needle);
}
//declare and assign neddle variable 
//call the test function 
// inside the test declare and assign a new needle variable and assign it as magnet
//log magnet
//3
var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);
//declare and assign brendan variable 
//log super cool
//4
var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}
//declare and assign food variable = chicken
//log chicken
//call the eat function
//declare and assing new variable food and assign as gone 
//reassign for food variable as half-chicken
//log half-chicken
//5
mean();
console.log(food);
var mean = function() {
    food = "chicken";
    console.log(food);
    var food = "fish";
    console.log(food);
}
console.log(food);
//hoist a variable mean 
//call the mean function it will get an error (TypeError: mean is not a function)
//6
console.log(genre);
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);
//declare a variable genre 
//log undefined
//assing variable genre to disco
//call the rewind function 
//declare a new variable genre inside the function 
//assign the variable genre to rock 
//log rock
//reassing the variable to r&b
//log r&b
//log disco
//7
dojo = "san jose";
console.log(dojo);
learn();
function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
console.log(dojo);
//declare variable dojo and assign to san jose 
//log sanjose
//call learn function
//declare variable dojo inside the function 
//assign the dojo variable to seattle
//log seattle
//reassign the dojo variable to burbank 
//log burbank 
//log san jose
//8 - Bonus ES6: const
console.log(makeDojo("Chicago", 65));
console.log(makeDojo("Berkeley", 0));
function makeDojo(name, students){
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if(dojo.students > 50){
        dojo.hiring = true;
    }
    else if(dojo.students <= 0){
        dojo = "closed for now";
    }
    return dojo;
}
//call makeDojo function
//declare a constant variable dojo as dectionary 
//assign the key name for dojo to chicago
//assign the key students for dojo to 65
//check if dojo.student grater than 50 
//assign the key hiring for dojo to true
//return dojo
//log {hiring: true,name: "Chicago",students: 65}
//call makeDojo function
//declare a constant variable dojo as dectionary 
//assign the key name for dojo to Berkeley
//assign the key students for dojo to 0
//check if dojo.student grater than 50 -> No
//check if dojo.student less than or equal 0 -> Yes
//Uncaught TypeError: Assignment to constant variable."
