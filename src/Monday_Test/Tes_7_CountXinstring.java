package Monday_Test;
/*
Write a program that counts the number of spaces in the specified String.
 */

import java.util.Scanner;

public class Tes_7_CountXinstring {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please write a Sentence or two :   ");
//        StringBuilder inputSentences = new StringBuilder(keyboard.nextLine());
        String inputSentences = keyboard.nextLine();

        // Short code version
        System.out.println("Hear is total number of spaces from your Sentences : "
                + (inputSentences.length() - inputSentences.replaceAll(" ", "").length()));

//        System.out.println("Total number of spaces are: " + totalXinTheString(inputSentences)); // this code is with the method totalXinTheString

    }

    // Another way of writing is

//    public static int totalXinTheString(String Count1) {
//
//        char characterA = ' ';
//        int count = 0;
//        for (int i = 0; i < Count1.length() - 1; i++) {
//            if (Count1.charAt(i) == characterA) {
//                count++;
//            }
//        }
//        return count;
//    }
}
