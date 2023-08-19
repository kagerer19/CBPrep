package JavaW4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> englishDictionary = new HashMap<>();
        Map<String, String> germanDictionary = new HashMap<>();

        boolean shouldExit = false;

        while (!shouldExit) {
            System.out.println("1) Add a word pair");
            System.out.println("2) Remove a word pair");
            System.out.println("3) Translate a word");
            System.out.println("4) Leave");

            int userOption = sc.nextInt();
            String translation;

            switch (userOption) {
                case 1:
                    System.out.println("Add a word: ");
                    String wordToAdd = sc.next();

                    System.out.println("Add translation: ");
                    translation = sc.next();

                    addWordPair(wordToAdd, translation, englishDictionary, germanDictionary);
                    break;

                case 2:
                    System.out.println("Which word pair would you like to remove? (English word): ");
                    String wordToRemove = sc.next();
                    removeWordPair(wordToRemove, englishDictionary, germanDictionary);
                    System.out.println("Word pair removed!");
                    break;

                case 3:
                    System.out.println("Word to translate: ");
                    String wordToTranslate = sc.next();
                    translateWord(wordToTranslate, englishDictionary, germanDictionary);
                    break;

                case 4:
                    shouldExit = true;
                    System.out.println("END, Thank you for using CB-Translate");
                    break;

                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    public static void addWordPair(String englishWord, String germanWord, Map<String, String> englishDictionary, Map<String, String> germanDictionary) {
        englishDictionary.put(englishWord, germanWord);
        germanDictionary.put(germanWord, englishWord);
    }

    public static void removeWordPair(String englishWord, Map<String, String> englishDictionary, Map<String, String> germanDictionary) {
        String germanWord = englishDictionary.get(englishWord);
        if (germanWord != null) {
            englishDictionary.remove(englishWord);
            germanDictionary.remove(germanWord);
        }
    }

    public static void translateWord(String word, Map<String, String> englishDictionary, Map<String, String> germanDictionary) {
        String germanTranslation = englishDictionary.get(word);
        String englishTranslation = germanDictionary.get(word);

        if (germanTranslation != null) {
            System.out.println("German Translation: " + germanTranslation);
        } else if (englishTranslation != null) {
            System.out.println("English Translation: " + englishTranslation);
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }
}
