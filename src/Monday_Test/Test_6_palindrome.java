package Monday_Test;
/*
Write a program that checks whether a given String is a palindrome
(a string that stays the same when you flip it) or not.
 */

import java.util.Scanner;

public class Test_6_palindrome {
    public static void main(String args[]) {


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a Word to check if it's a palindrome:  ");
        String inputWord = keyboard.nextLine();
        System.out.println(isPalindrome(inputWord));

        // method 1 of writing code
        /*
        String reverse = "";

        int length = inputWord.length();

        for (int i = length - 1; i >= 0; i--)
//            reverse = reverse + inputWord.charAt(i);
            reverse += inputWord.charAt(i);

        if  (inputWord.equals(reverse))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome!!");
 */
    }
// another ways of writing with  methods
    public static boolean isPalindrome (String text) {
        String basicText = text.replaceAll(" ", "").toLowerCase();
        StringBuilder reverseText = new StringBuilder(basicText);
        reverseText.reverse();
        if (basicText.equals(reverseText.toString())){
            return true;
        }
        return false;

    }
}
