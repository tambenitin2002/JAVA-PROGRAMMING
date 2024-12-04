package array;

import java.util.Arrays;

public class NegativePositiveDivider {

	public static void main(String[] args) {
		int[] array = {4, -1, 7, -7, 6, 2, -1, 8, 1, -3};
        int n = array.length;
        
        // Create a new array to store the result
        int[] result = new int[n];
        int index = 0;

        // First, place all the -1 values on the left
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                result[index] = array[i ];
                index++;
            }
        }

        // Then, place all other values on the right
        for (int i = 0; i < n; i++) {
            if (array[i] >= 0) {
                result[index] = array[i];
                index++;
            }
        }

        // Print the modified array
        System.out.println("Array after shifting -1 to the left:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
	}

}
