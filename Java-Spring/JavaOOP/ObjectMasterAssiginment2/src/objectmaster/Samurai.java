package objectmaster;

public class Samurai extends Human{
    private static int countStatic =0;

    public Samurai() {
        this.setHealth(200);
        countStatic++;
    }
    public void deathBlow(Human human){
        human.setHealth(0);
        this.setHealth(this.getHealth()/2);
    }
    public void meditate(){
        this.setHealth(this.getHealth()+this.getHealth()/2);
    }

    public static int howManyStatic(){
        return countStatic;
    }
}
