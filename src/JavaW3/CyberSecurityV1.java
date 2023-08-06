import java.util.Arrays;
import java.util.Random;

public class CyberSecurityV1 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] givenChars = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '!'};
        char[] passwordToGuess = new char[4];
        int iterations = 10;
        int sum = 0;

        for (int i = 0; i < iterations; i++) {
            // Generation of a random password
            for (int j = 0; j < passwordToGuess.length; j++) {
                passwordToGuess[j] = givenChars[r.nextInt(givenChars.length)];
            }

            System.out.println("Password: " + Arrays.toString(passwordToGuess));

            int guesses = 0;
            boolean passwordFound = false;

                char[] currentGuess = new char[4];
                for (char first : givenChars) {
                    for (char second : givenChars) {
                        for (char third : givenChars) {
                            for (char fourth : givenChars) {
                                currentGuess[0] = first;
                                currentGuess[1] = second;
                                currentGuess[2] = third;
                                currentGuess[3] = fourth;
                                guesses++;

                                if (Arrays.equals(passwordToGuess, currentGuess)) {
                                    System.out.println("I found Your Password: " + Arrays.toString(currentGuess));
                                    System.out.println("It took me " + guesses + " times");
                                    passwordFound = true;
                                    break;
                                }
                            }
                            if (passwordFound) {
                                break;
                            }
                        }
                        if (passwordFound) {
                            break;
                        }
                    }
                    if (passwordFound) {
                        break;
                    }
                }
            sum += guesses;
        }

        System.out.printf("Average: %d times. \n", sum / iterations);
    }
}
