import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
public class PuzzleJava{
    public static int[] ArrayPuzzle(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
		System.out.println(sum + " is sum of numbers");
		// allocate new array size for the number of values greater than 10
        int j = 0;
        int count =0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > 10) {
                count++;
            }
        }
        int[] newArr = new int [count];
        for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > 10) {
                newArr[j]=numbers[i];
                j++;
            }
        }
		return newArr;
    }
    public static ArrayList<String> shuffleArray() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Collections.shuffle(names);
        System.out.println(names);
        ArrayList<String> result = new ArrayList<String>();
        for(String i: names){
            if (i.length() >5){
                result.add(i);
            }
        }
        return result;
    }

    public void lettersOfTheAlphabet(){
        ArrayList<Character> letters =new ArrayList<Character>();
        for (char i='a';i<'z';i++){
            letters.add(i);
        }
        Collections.shuffle(letters);
        System.out.println("The last letter is "+letters.get(letters.size()-1));
        System.out.println("The first letter is "+letters.get(0));
        if(letters.get(0)=='a'||letters.get(0)=='e'||letters.get(0)=='o'||letters.get(0)=='u'||letters.get(0)=='i'){
            System.out.println("This letter is a vowel");
        }
    }

    public int[] randomNumbers(){
        int[] array =new int[10];
        Random random = new Random();
        for (int i=0;i<array.length;i++){
            array[i]=random.nextInt(100-55) + 55;
        }
        return array;
    }

    public void sortedArrayNumbers(){
        int[] array =new int[10];
        Random random = new Random();
        for (int i=0;i<array.length;i++){
            array[i]=random.nextInt(100-55) + 55;
        }
        Arrays.sort(array);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        int max = array[0];
        int min = array[0];
        for (int i=0;i<array.length;i++){
            if(max > array[i]){
                max = array[i];
            }
        }
        for (int i=0;i<array.length;i++){
            if(min < array[i]){
                min = array[i];
            }
        }
        System.out.println("The minimum value = " +max);
        System.out.println("The maximum value = " +min);
    }
    
    public String randomString(){
        String string  ="";
        ArrayList<Character> letters =new ArrayList<Character>();
        for (char i='a';i<'z';i++){
            letters.add(i);
        }
        Random random = new Random();
        for (int i=0;i<5;i++){
            int randomResult =random.nextInt(25) + 0;
            char getChar = letters.get(randomResult);
            String getString =Character.toString(getChar);
            string=string.concat(getString);
        }
        return string;
    }

    public String[] arrayOfRandomStrings(){
        String [] array =new String[10];
        for(int i=0;i<array.length;i++){
            array[i]= randomString();
        }
        return array;
}
}