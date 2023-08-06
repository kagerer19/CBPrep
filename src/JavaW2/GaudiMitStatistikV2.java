package JavaW2;

import java.util.Arrays;
import java.util.Random;


public class GaudiMitStatistikV2 {
    public static void main(String args[]) {
        Random r = new Random();
        int[] arr = new int[100];
        int temp;

        // Generate 100 random values

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        // outer selects elements
        // inner selects values to allow comparison

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
