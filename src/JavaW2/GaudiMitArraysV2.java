package JavaW2;

import java.util.Arrays;

public class GaudiMitArraysV2 {
    public static void main(String args[]) {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char [] charArray = alpha.toCharArray();
        int howMuch = 3;
        int letterIndex = 0;

        howMuch = howMuch % 26;

        for(int i = 0; i < 26; i++){
            letterIndex = (i + howMuch) % charArray.length;
            if (letterIndex < 0) {
                letterIndex = letterIndex + 26;
            } else if (letterIndex > 25) {
                letterIndex = letterIndex - 26;
            }
            charArray[i] = alpha.charAt(letterIndex);
        }
        System.out.println(Arrays.toString(charArray));
    }
}