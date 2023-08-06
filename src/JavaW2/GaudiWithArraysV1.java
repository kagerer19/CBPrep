package JavaW2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class GaudiWithArraysV1 {
    public static void main(String args[]) {
        Random r = new Random();

        /* Create a dimensional array with any 10 int values, which you fill using the curly brackets {}.*/
        int[] wallet = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        /* Create a second one-dimensional array with 100 int values using loops, which you fill with random numbers between 0 and 100*/
        int[] randomArray = new int[100];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt(100);
            System.out.println(randomArray[i]);
        }
        System.out.println(Arrays.toString(randomArray));

        /*Create a third one-dimensional array with 10 boolean values, using loops, where each true in this array is followed by a false and vice versa (therefore alternating between true and false).*/
        boolean [] seats = new boolean[10];
        for (int i = 0; i < seats.length; i++) {
            if(i % 2 == 0 ) {
                seats[i] = true;
            }
            System.out.println(seats[i]);
        }

        /*Arrays.fill(seats, true);*/

        /*for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt(100);
        }*/

        /*for(int i : randomArray){
            System.out.println(i);
        }*/

        // Check if prime number logic

        /*for(int k = 1; k <= 100; k++) {
            if(isPrime % k == 0){
                c++;
            }
        }
        boolean prime;
        if(c == 2) {
            prime = true;
        } else {
            prime = false;
        }*/

    }
}

