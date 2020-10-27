package Monday_Test;

import java.util.Scanner;
/*
Write a program that asks the user for two numbers and then shows the sum,
 after showing the sum ask the user if he wants to run this operation again,
 if yes, the execution starts again if no, the program ends.
 */

public class Test_3 {

    public static void main(String[] args) {
        inputData();
    }

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your First number: ");
        int a = scanner.nextInt();
        System.out.print("Please enter your Second number: ");
        int b = scanner.nextInt();
        System.out.println("Total value is: " + numberSum(a, b));
        System.out.print("Would you like to calculate again: ");
        char repeat = (char) scanner.next().charAt(0);

        if (repeat == 'y' || repeat == 'Y') {
            inputData();
        }

    }

    public static int numberSum(int a, int b) {

        return a + b;
    }
}
