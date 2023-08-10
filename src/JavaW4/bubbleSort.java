package JavaW4;

import java.util.Arrays;
import java.util.Random;

public class bubbleSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        int temp;

        // Generate 100 random values

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));

        //Start timer
       /* long startTime = System.currentTimeMillis();*/

        boolean sorted = true;
        while (sorted) {

            sorted = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = true;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    System.out.println(Arrays.toString(arr));
                }
            }
        }

        /*System.out.println("AFTER:");*/

       /* //End timer after sorting is complete
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Time taken: " + (endTime - startTime) + "ms");*/
    }
}
