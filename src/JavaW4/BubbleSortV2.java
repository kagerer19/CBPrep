package JavaW4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSortV2 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> arr = new ArrayList<>();
        int temp;

        // Generate 100 random values
        for (int i = 0; i < 6; i++) {
            arr.add(r.nextInt(100));
        }

        System.out.println("Before:");
        System.out.println(arr);

        boolean sorted = true;
        while (sorted) {
            sorted = false;

            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i) > arr.get(i + 1)) {
                    sorted = true;
                    temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                }
            }
        }

        System.out.println("AFTER:");
        System.out.println(arr);
    }
}