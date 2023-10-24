import java.util.Arrays;
import java.util.Random;

public class ArrayShuffler {

    private static void shuffleAnArray(int[] array) {
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; 
        System.out.println("Original Array: " + Arrays.toString(numbers));
        shuffleAnArray(numbers);
        System.out.println("Shuffled Array: " + Arrays.toString(numbers));
    }
}
