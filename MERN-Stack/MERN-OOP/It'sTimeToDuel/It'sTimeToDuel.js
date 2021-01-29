class Card{
    constructor(name,cost){
        this.name=name;
        this.cost=cost;
    }
}
class Unit extends Card{
    constructor(name,cost,power,resilience){
        super(name,cost);
        this.resilience=resilience;
        this.power=power;
    }
    attack(target){
        target.resilience-=this.power;
    }
    showStats(){
        console.log(`My name is: ${this.name}, My Cost equals: ${this.cost}, My Resilience equals: ${this.resilience} and My Power equals: ${this.power}`);
    }
}
class Effects extends Card{
    constructor(name,cost,text,stat,magnitude){
        super(name,cost);
        this.text=text;
        this.stat=stat;
        this.magnitude=magnitude;
    }
    play(target) {
        if(target instanceof Unit) {
            if(this.stat =="resilience"){
                target.resilience+=this.magnitude;
            }
            else if(this.stat =="power"){
                target.power+=this.magnitude;
            }
        } else {
            throw new Error( "Target must be a unit!" );
        }
    }
}
const redBeltNinja = new Unit("Red Belt Ninja",3,3,4);
const blackBeltNinja = new Unit("Black Belt Ninja",4,5,4);
const hardAlgorithm = new Effects("Hard Algorithm",2,"increase target's resilience by 3","resilience",3);
const unhandledPromiseRejection = new Effects("Unhandled Promise Rejection",1,"reduce target's resilience by 2","resilience",-2);
const pairProgramming = new Effects("Pair Programming",3,"increase target's power by 2","power",2);
redBeltNinja.showStats();
blackBeltNinja.showStats();
hardAlgorithm.play(redBeltNinja);
console.log("****** First Play ******");
redBeltNinja.showStats();
blackBeltNinja.showStats();
unhandledPromiseRejection.play(redBeltNinja);
console.log("****** Second Play ******");
redBeltNinja.showStats();
blackBeltNinja.showStats();
pairProgramming.play(blackBeltNinja);
console.log("****** Third Play ******");
redBeltNinja.showStats();
blackBeltNinja.showStats();
redBeltNinja.attack(blackBeltNinja);
console.log("****** Attack ******");
redBeltNinja.showStats();
blackBeltNinja.showStats();



