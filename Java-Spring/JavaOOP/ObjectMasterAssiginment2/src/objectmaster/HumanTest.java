package objectmaster;

public class HumanTest {
    public static void main(String[] args) {
        Human human1=new Human(5,3,3,100);
        Human human2=new Human();
        human1.attack(human2);
        System.out.println(human2.getHealth());
        Wizard kamal = new Wizard();
        Samurai abed = new Samurai();
        Samurai tareq = new Samurai();
        Ninja yasmeen = new Ninja();
        kamal.fireball(abed);
        System.out.println(abed.getHealth());
        abed.deathBlow(human2);
        System.out.println(human2.getHealth());
        System.out.println(abed.getHealth());
        yasmeen.steal(kamal);
        System.out.println(yasmeen.getHealth());
        yasmeen.runAway();
        System.out.println(yasmeen.getHealth());
        System.out.println(kamal.getHealth());
        System.out.println(Samurai.howManyStatic());


    }
}
