package JavaW4;

import java.util.Arrays;
import java.util.Random;

public class insertionSort {
    public static void main(String [] args) {
        Random rand = new Random();

        int [] arr = new int[12];


        for (int x = 0; x < arr.length; x++){
            arr[x] = rand.nextInt(100);
        }

        System.out.println("BEFORE: ");
        System.out.println(Arrays.toString(arr));

        //Start timer
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        System.out.println("AFTER: ");

        //End timer after sorting is complete
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        System.out.println("Time taken: " + (endTime - startTime) + "ms");

    }
}
