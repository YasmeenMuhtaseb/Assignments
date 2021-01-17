package objectmaster;

public class Human {
    private int strength =3;
    private int stealth =3;
    private int intelligence =3;
    private int health=100;

    public Human() {
    }

    public Human(int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {

        this.health = health;
    }

    public int getIntelligence() {

        return intelligence;
    }

    public void setIntelligence(int intelligence) {

        this.intelligence = intelligence;
    }

    public int getStealth() {

        return stealth;
    }

    public void setStealth(int stealth) {

        this.stealth = stealth;
    }

    public int getStrength() {

        return strength;
    }

    public void setStrength(int strength) {

        this.strength = strength;
    }

    public void attack(Human attacked){
        int healthAttacked = attacked.getHealth()-this.strength;
        attacked.setHealth(healthAttacked);
    }
}
