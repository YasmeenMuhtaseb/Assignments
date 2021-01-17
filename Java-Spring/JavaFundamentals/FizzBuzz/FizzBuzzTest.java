public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz number = new FizzBuzz();
        String result = number.fizzBuzz(15);
        String result1 = number.fizzBuzz(3);
        String result2 = number.fizzBuzz(5);
        String result3 = number.fizzBuzz(2);
        System.out.println("The Number is: " + result);
        System.out.println("The Number is: " + result1);
        System.out.println("The Number is: " + result2);
        System.out.println("The Number is: " + result3);
    }
}
