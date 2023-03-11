package homeworks.exeptions.arithmetic_excep;


import java.util.Scanner;

public class ArithmeticExcep  {

    /**
     * catching ArithmeticException(/0)
     */
    public static void ArithmeticEx() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();

        try {
            int test = 1 / i;
            System.out.println(test);
        } catch (ArithmeticException e) {
            System.out.println(" Invalid input. Please enter an integer value");

        }

    }

}


