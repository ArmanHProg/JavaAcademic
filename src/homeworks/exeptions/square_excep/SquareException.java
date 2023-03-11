package homeworks.exeptions.square_excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareException {

    /**
     * catching negative number from input
     */
    public  static  void  squareEx(){

        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int i = sc.nextInt();

        try {
            if(i >= 0) {
                System.out.println(Math.sqrt(i));
            }
            else {
                throw new NumberFormatException();
            }
        }catch(NumberFormatException e) {
            System.out.println("Invalid number");
        }finally {
            System.out.println("Goodbye");
        }


    }
}
