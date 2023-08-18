package JavaW4;

import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 72, 6, 5, 4, 3, 2, 900, 44};

        System.out.println("Before");
        System.out.println(Arrays.toString(arr));

        System.out.println("After");
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        int listSize = arr.length;

        //Base case
        if (listSize < 2) {
            return;
        }

        int midIndex = listSize / 2;
        int[] leftSide = new int[midIndex];
        int[] rightSide = new int[listSize - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftSide[i] = arr[i];
        }

        for (int i = midIndex; i < listSize; i++) {
            rightSide[i - midIndex] = arr[i];
        }

        mergeSort(leftSide);
        mergeSort(rightSide);

        merge(arr, leftSide, rightSide);
    }

    public static void merge(int[] arr, int[] leftSide, int[] rightSide) {
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;

        int i = 0, j = 0, k = 0;   // i = leftIndex;  j = rightIndex;  k = merged array index;

        // merge left side and right side into sorted final array
        while (i < leftSize && j < rightSize) {
            if (leftSide[i] <= rightSide[j]) {
                arr[k] = leftSide[i];
                i++;
            } else {
                arr[k] = rightSide[j];
                j++;
            }
            k++;
        }

        //loop over leftover numbers
        while (i < leftSize) {
            arr[k] = leftSide[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightSide[j];
            j++;
            k++;
        }
    }
}
