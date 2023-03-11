package homeworks.exeptions.div_nums_excep;


import java.util.Scanner;

public class DivNums {

    /**
     * catching ArithmeticException when user input b = 0
     */

    public static void dividing() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        double a = sc.nextInt();
        System.out.println("enter second number");
        double b = sc.nextInt();


        try {
            double sum = a/b;
            System.out.println(sum);
        }catch (ArithmeticException e){
            System.out.println(" error:  dividing by zero ");
        }


    }

}
