import java.util.Arrays;

public class ArrayShift {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6};

        System.out.println("Array is: " + Arrays.toString(array1));

        // Create a new array
        int[] result = new int[array1.length];

        // Shift array by 2

        int[] shiftArray = new int[2];
        System.arraycopy(array1, 0, shiftArray, 0, 2); //Copy the first shift elements

        for (int i = 0; i < array1.length; i++) {
            int currentShiftIndex = (i + 2) % array1.length;
            int shiftedValueIndex = i % 2;
            int temp = array1[currentShiftIndex]; //Simple Swap
            array1[currentShiftIndex] = shiftArray[shiftedValueIndex];
            shiftArray[shiftedValueIndex] = temp;
        }

        System.out.println("Shifted array is: " + Arrays.toString(array1));

    }

}
