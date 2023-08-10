package JavaW4;

import java.util.Arrays;
import java.util.Random;

public class selectionSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] list = new int[12];

        for (int i = 0; i < list.length; i++) {
            list[i] = r.nextInt(1000);

        }
        System.out.println("BEFORE");
        System.out.println(Arrays.toString(list));

        //Start timer
        long startTime = System.currentTimeMillis();
        boolean sorted = true; // set true to enter while loop

        while (sorted) {
            sorted = false; // set to false before sorting starts

            int n = list.length;
            for (int i = 0; i < n - 1; i++) {
                int min_index = i;
                for (int j = i + 1; j < n; j++) {
                    if (list[j] < list[min_index]) {
                        min_index = j;

                        int temp = list[min_index];
                        list[min_index] = list[i];
                        list[i] = temp;
                        sorted = true; // set back to true once items have swapped to continue sorting
                    }
                }
            }
        }

        System.out.println("AFTER: ");
        //End timer after sorting is complete
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(list));
        System.out.println("Time taken: " + (endTime - startTime) + "ms");

    }
}


//system.nanosec