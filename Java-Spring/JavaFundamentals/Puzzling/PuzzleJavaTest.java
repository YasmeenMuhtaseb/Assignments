public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzlejava = new PuzzleJava();
        int[] numbers = {3,5,1,2,7,9,8,13,25,32};
        int [] result = puzzlejava.ArrayPuzzle(numbers);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        System.out.println("********************************************");
        System.out.println(puzzlejava.shuffleArray());
        System.out.println("********************************************");
        puzzlejava.lettersOfTheAlphabet();
        System.out.println("********************************************");
        puzzlejava.randomNumbers();
        System.out.println("********************************************");
        puzzlejava.sortedArrayNumbers();
        System.out.println("********************************************");
        System.out.println(puzzlejava.randomString());
        System.out.println("********************************************");
        String [] result2 = puzzlejava.arrayOfRandomStrings();
        for (int i=0;i<result2.length;i++){
            System.out.println(result2[i]);
        }

    }
}
