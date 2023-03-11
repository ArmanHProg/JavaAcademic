package homeworks.exeptions.age_exception;

import java.io.IOException;
import java.util.Scanner;

public class AgeException {

    /**
     * method print age and catches negative or >120 ages
     */
    public static void AgeEx(){

        Scanner sc = new Scanner(System.in);
        System.out.println("please input your age:  ");
        int age = sc.nextInt();

      try {
          if (age < 0 || age > 120 ){
              throw new IOException();
          }else {
              System.out.println("your iga is: "+age);
          }
      }catch (IOException e){
          System.out.println(" Error: invalid number");
      }


    }


}
