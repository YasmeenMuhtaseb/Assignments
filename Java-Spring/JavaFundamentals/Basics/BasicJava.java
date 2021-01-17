import java.util.ArrayList;
public class BasicJava{
    public static void printTo(){
        for (int i=0;i<=255;i++){
            System.out.println(i);
        }
    }
    public static void oddNumbers(){
        for (int i=0;i<=255;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
    public static void printSum(){
        int sum=0;
        for (int i=0;i<=255;i++){
            sum+=i;
            System.out.println("New Number: " + i +"Sum: " + sum);
        }
    }
    public static void printArray(){
        int[] x = {1,3,5,7,9,13};
        for (int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    public static void printMax(int[] x){
        int max = x[0];
        for (int i=0;i<x.length;i++){
            if(max<x[i]){
                max=x[i];
            }
        }
        System.out.println(max);
    }
    public static void printAverage(int[] x){
        int sum = 0;
        for (int i=0;i<x.length;i++){
            sum+=x[i];
        }
        System.out.println(sum/x.length);
    }
    public static void arrayOfOdd(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i=0;i<=255;i++){
            if(i%2 !=0){
                array.add(i);
            }
        }
        System.out.println(array);
    }
    public static void greaterThan(int[] x,int y){
        int count =0;
        for (int i=0;i<x.length;i++){
            if(y<x[i]){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void squareArray(int[] x){
        for (int i=0;i<x.length;i++){
            x[i]=x[i]*x[i];
            System.out.println(x[i]);
        }
    }
    public static void EliminateNegative(int[] x){
        for (int i=0;i<x.length;i++){
            if(x[i]<0){
                x[i]=0;
            }
            System.out.println(x[i]);
        }
    }
    public static void minMaxAvg(int[] x){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int max =x[0];
        int min =x[0];
        int sum = 0;
        for (int i=0;i<x.length;i++){
            sum+=x[i];
            if(max<x[i]){
                max=x[i];
            }
            if(min>x[i]){
                min=x[i];
            }
        }
        result.add(max);
        result.add(min);
        result.add(sum/x.length);
        System.out.println(result);
    }
    public static void shiftArray(int[] x){
        for (int i=1;i<x.length;i++){
            x[i-1]=x[i];
        }
        x[x.length-1]=0;
        for (int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
    
    public static void main(String[] args) {
        printTo();
        System.out.println("***********************************");
        oddNumbers();
        System.out.println("***********************************");
        printSum();
        System.out.println("***********************************");
        printArray();
        System.out.println("***********************************");
        int[] x = {1,3,5,-7,9,13};
        printMax(x);
        System.out.println("***********************************");
        printAverage(x);
        System.out.println("***********************************");
        arrayOfOdd();
        System.out.println("***********************************");
        greaterThan(x,5);
        System.out.println("***********************************");
        squareArray(x);
        System.out.println("***********************************");
        EliminateNegative(x);
        System.out.println("***********************************");
        minMaxAvg(x);
        System.out.println("***********************************");
        shiftArray(x);
    }
}