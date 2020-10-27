package Monday_Test;
/*
Write a small game that generates a random number that the user can then guess,
 the number stays the same until the user gets it right.
 Then the game ends, with congratulations and the total number of attempts.
 (Tip: make it easy on yourself and set the limit of the number somewhere between 1-10 for example)
 */

import java.util.Random;
import java.util.Scanner;

public class Test_4_RandomNumberGame {
    public static void main(String[] args) {
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24
//        int rendom = rand.nextInt(25);
        int int_random = rand.nextInt(upperbound);
//        double double_random=rand.nextDouble();
//        float float_random=rand.nextFloat();

        System.out.println("Random integer value from 0 to " + (upperbound - 1) + " : " + int_random);
//        System.out.println("Random float value between 0.0 and 1.0 : "+float_random);
//        System.out.println("Random double value between 0.0 and 1.0 : "+double_random);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a correct number to stop the game:  ");
        int input = keyboard.nextInt();
        int counter =0;
        while (int_random != input) {
            counter++;
            System.out.println("Try again ha ha ha");
            input = keyboard.nextInt();
        } System.out.println("You are a Winner!!");


//        if (int_random != input) {
//            System.out.println("Try again ha ha ha");
//
//        } else System.out.println("You are a Winner!!");

    }
}

