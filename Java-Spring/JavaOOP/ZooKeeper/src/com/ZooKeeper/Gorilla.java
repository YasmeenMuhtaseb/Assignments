package com.ZooKeeper;

public class Gorilla extends Mammal{
    public void throwSomething(){
        System.out.println("The gorilla has thrown something");
        int decrease = getEnergyLevel()-5;
        setEnergyLevel(decrease);
    }
    public void eatBananas(){
        System.out.println("The gorilla's satisfaction");
        int decrease = getEnergyLevel()+10;
        setEnergyLevel(decrease);
    }
    public void climb(){
        System.out.println("The gorilla has climbed a tree");
        int decrease = getEnergyLevel()-10;
        setEnergyLevel(decrease);
    }

}
