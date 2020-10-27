package Monday_Test;
//Write a program that caps/takes the last 3 symbols/characters for a given string.

import java.util.Scanner;

public class Test_8_takelastXsletters {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please write a Sentence or words :  ");
        String input = keyboard.nextLine();
        System.out.println("The last three characters are:  " + getLastThree(input).toUpperCase() );

    }


    public static String getLastThree(String myString) {
        if(myString.length() > 3)
            return myString.substring(myString.length()-3);
        else
            return myString;
    }
}
