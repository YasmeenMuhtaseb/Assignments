package objectmaster;

public class HumanTest {
    public static void main(String[] args) {
        Human human1=new Human(5,3,3,100);
        Human human2=new Human();
        human1.attack(human2);
        System.out.println(human2.getHealth());
    }
}
