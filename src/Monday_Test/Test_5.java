package Monday_Test;
/*
Write a program that requests a String and then returns it in reverse. (Tip: Use the StringBuilder)
 */

import java.util.Scanner;

public class Test_5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please write a Sentence or two :   ");
        StringBuilder inputSentences = new StringBuilder(keyboard.nextLine());
        System.out.println("Hear is reverse of your Sentences : " + inputSentences.reverse());
    }
}
