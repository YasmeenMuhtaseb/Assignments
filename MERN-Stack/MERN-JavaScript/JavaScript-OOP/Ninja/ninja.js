class Ninja{
    constructor(name){
        this.name=name;
        this.health=100;
        this.speed=3;
        this.strength=3;
    }
    sayName(){
        console.log(`My name is: ${this.name}`);
    }
    showStats(){
        console.log(`My name is: ${this.name}, My health equals: ${this.health}, My Speed equals: ${this.speed} and My Strength equals: ${this.strength}`);
    }
    drinkSake(){
        this.health+=10;
    }
}
const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.drinkSake();
ninja1.showStats();