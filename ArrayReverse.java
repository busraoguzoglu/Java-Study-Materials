import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};

        System.out.println("Array is: " + Arrays.toString(array1));

        // Create a new array
        int[] result = new int[array1.length];

        // Populate result array
        for (int i = 0, j = result.length - 1; i < array1.length; i++, j--) {
            result[j] = array1[i];
        }

        System.out.println("Reversed array is: " + Arrays.toString(array1));

    }
}