package Monday_Test;

import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your words: ");
        String inputWords = scanner.nextLine();


//        for (int i = 0; i < inputWords.length() -1; i++) {
//            if (inputWords.charAt(i) == 'a' || inputWords.charAt(i) == 'e' || inputWords.charAt(i) == 'i' || inputWords.charAt(i) == 'o' || inputWords.charAt(i) == 'u') {
//                System.out.println("Given string contains " + inputWords.charAt(i) + " at the index " + i);
//            }

            System.out.println("Total vowels are: " + vowels(inputWords));
        }


    public static String vowels(String words) {
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i' || words.charAt(i) == 'o' || words.charAt(i) == 'u') {
                System.out.println("Given string contains " + words.charAt(i) + " at the index " + i);
            }

        }
        return words;
    }

}
