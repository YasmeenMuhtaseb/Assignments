package com.ZooKeeper;

public class Bat extends Mammal{
    public Bat() {
        setEnergyLevel(300);
    }
    public void fly(){
        System.out.println("The sound a bat taking");
        int decrease = getEnergyLevel()-50;
        setEnergyLevel(decrease);
    }
    public void eatHumans(){
        System.out.println("The so- well, never mind");
        int increase = getEnergyLevel()+25;
        setEnergyLevel(increase);
    }
    public void attackTown(){
        System.out.println("The sound of a town on fire");
        int decrease = getEnergyLevel()-100;
        setEnergyLevel(decrease);
    }

}
