package JavaW3;

import java.util.Random;

public class GaudiMitStatistikV3 {
    public static void main(String args[]) {
        Random r = new Random();
        int[] arr = new int[100];
        int temp;

        // Generate 100 random values

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        //Print original list

        System.out.print("Original list:\n[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");



        // Sorting array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Output ordered list
        System.out.print("Sorted in ascending order:\n[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Calculate the arithmetic mean
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double mean = (double) sum / arr.length;
        System.out.println("Arithmetic mean: " + mean);

        // Calculate the range (span)

        int range = arr[arr.length - 1] - arr[0];
        System.out.println("Range: " + range);

        // Calculate the median value

        double median;
        median = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        System.out.printf("Median: %.1f %n", median);

        // Calculate the modal value (most often occurring number)

        int mode = arr[0];
        int modeCount = 1;
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > modeCount) {
                mode = arr[i];
                modeCount = currentCount;
            }
        }
        System.out.println("Mode: " + mode + " with " + modeCount);

        // Calculate the mean absolute deviation
        double meanDeviation = 0;
        for (int i = 0; i < arr.length; i++) {
            meanDeviation += Math.abs(arr[i] - mean);
        }
        meanDeviation /= arr.length;
        System.out.printf("Mean absolute deviation: %.1f", meanDeviation);
    }
}
