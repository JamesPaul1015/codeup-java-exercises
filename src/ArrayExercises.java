import java.util.Arrays;
import java.util.Random;

public class ArrayExercises {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        //Generates 10 Random Numbers in the range 1 -20
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
        }//end for loop
        System.out.printf("Numbers Generated: " + Arrays.toString(numbers));

    }
    public int countOdds(int[] data) {
        int oddCount = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1) // if it's odd
                oddCount++;        // increment the counter
        }
        return oddCount;
    }
}











    //    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Random Number [" + (i + 1) + "] : " + (int) (Math.random() * 100));
//
//        }
//    }
//
//}
