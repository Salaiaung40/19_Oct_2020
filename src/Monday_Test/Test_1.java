package Monday_Test;

public class Test_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.println("by 3: "+ i + ", ");

            if (i % 5 == 0)
                System.out.println("by 5: "+ i + ", ");

            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("by 3 and 5: "+ i + ", ");


        }
    }
}
