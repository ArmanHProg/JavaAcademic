package homeworks.operators;

import java.util.Random;
import java.util.Scanner;

public class Homework4a {


    void inputNum() {

        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            input = scanner.nextInt();
        } while (input <= 0);

        for (int i = 1; i < 11; i++) {
            System.out.println(input + " * " + i + " =" + input * i);
        }
    }

    void pow() {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int pow = input1;
        if (input2 > 0) {
            for (int i = 1; i < input2; i++) {
                pow *= input1;
            }
            System.out.println(pow);
        } else {
            for (int i = 1; i < -input2; i++) {
                pow *= input1;
            }
            double x =  1.0 / (double) pow;
            System.out.println(x);
        }
    }

     void reverse(){
         Scanner scanner = new Scanner(System.in);
         int input = scanner.nextInt();
         int reversed = 0;

         while(input != 0) {

             int digit = input % 10;
             reversed = reversed * 10 + digit;

             input /= 10;
         }

         System.out.println("Reversed Number: " + reversed);


     }

    void isPrime() {

        int input;
        boolean a = false;

        do {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();

        } while (input <= 1);

        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                a = true;
            }

        }
        if (a) {
            System.out.println("is not prime");
        } else System.out.println("is prime");
    }

    void twoNumbers() {

        int input, input2, input3;
        double a;
        do {
            System.out.println("write two numbers");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            input2 = scanner.nextInt();
            a = input + input2;
            System.out.println(a);
            System.out.println("do you perform the operation again? 0-yes/1-no");
            input3=scanner.nextInt();

        }while (input3 == 1);
    }

    void countNumbers() {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int input;
        String x;
        boolean a = false;
        do {
            System.out.println(" write as  numbers as you want");

            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();

            if (input > 0) {
                positive++;
            } else if (input < 0) {
                negative++;
            } else zero++;
            System.out.println("Do you want to add again Y/N");

            Scanner sc = new Scanner(System.in);
            x = sc.next();

            if (x.contains("y"))
                a = true;
            else if (x.contains("n")) a = false;
            else System.out.println("you are print wrong symbol");


        } while (a);

        System.out.println("your positive numbers count " + positive);
        System.out.println("your negative numbers count " + negative);
        System.out.println("your zeros count " + zero);

    }


    void countNumbers1() {
        int input;
        String x;
        boolean a = false;
        int max;
        System.out.println(" write as  numbers as you want");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        max = input;
        do {
            System.out.println(" write as  numbers as you want");
            Scanner scanner1 = new Scanner(System.in);
            input = scanner1.nextInt();
           if (input > max) max = input;


               System.out.println("Do you want to add again Y/N");

               Scanner sc = new Scanner(System.in);
               x = sc.next();

               if (x.contains("y"))
                   a = true;
               else if (x.contains("n")) a = false;
               else System.out.println("you are print wrong symbol");


        } while (a);

        System.out.println(max);

    }

    void isArmstrong(int x){
        int a;
        int b;
        int z;

        a = x%10;
        b = x%100/10;
        z = x%1000/100;

        if ((a * a * a)+(b *b * b)+(z*z*z) == x){
            System.out.println("yes");
        }else System.out.println("no");


    }

    void fun9(){
        double sum = 1;

        Scanner scanner =new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 2; i <= x; i++) {
            sum += 1.0/i;
        }
        System.out.println(sum);
    }

        void func10(){
            Scanner scanner =new Scanner(System.in);
            int n = scanner.nextInt();
            double sum= 1;

                for (int i = 2; i <= n; i += 2) {
                    sum -= 1.0 / i;
                    sum += 1.0/ (i+1);
                }
                System.out.println(sum);
            }

    void random(){
        boolean a = true;
        Random random = new Random();
        int x = random.nextInt(10);

        do {
        System.out.println("guess what the number is");
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();


        if (n > x){
            System.out.println(" Your number is bigger");

        }else if (n < x){
            System.out.println("Your number is smaller");

        }else {
            System.out.println("you are guess");
            a = false;

        }


        }while (a);
    }

    void func12() {

        for (int i = 1; i < 5; i++) {
            System.out.println("**********");
        }


        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1 ; i < 6; i++){
            for (int j = 0; j <   (9 - (2 * i - 1)) / 2 ; j++){
                System.out.print(" ");
            }
            for (int l = 0; l < i + i - 1; l++ ){
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1 ; i < 6; i++){
            for (int j = 0; j <   (9 - (2 * i - 1)) / 2 ; j++){
                System.out.print(" ");
            }
            for (int l = 1; l < i + i ; l++ ){
                System.out.print(i);
            }
            System.out.println();
        }


        for (int i = 1 ; i < 6; i++){
            for (int j = 0; j < (9 - (2 * i - 1)) / 2 ; j++){
                System.out.print(" ");
            }
            int x = i;
            for (int l = 1; l < i ; l++ ){
                System.out.print(x--);
            }
            System.out.print(x);
            for (int l = 1; l < i ; l++ ){
                System.out.print(++x);
            }
            System.out.println();
        }




    }

    public double sin(double number, int n){
        double radian = number * Math.PI/180;
    double sin =0;
    for (int i = 0; i<=n ; i++){
        sin += Math.pow(-1,i) * Math.pow(radian ,(i*2+1))/factorialOf(i*2+1);
    }
    return sin;
    }

    public long factorialOf(int number) {
        int result = 1;
        if (number < 0 && number % 2 != 0) {
            for (int i = 2; i <= -number; i++) {
                result *= i;
            }
            return -result;
        }
        if (number < 0) {
            for (int i = 2; i <= -number; i++) {
                result *= i;
            }
            return -result;
        }
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public double cos(double number, int n){
        double radian = number * Math.PI/180;
        double sin =0;
        for (int i = 0; i<=n ; i++){
            sin += Math.pow(-1,i) * Math.pow(radian ,(i*2))/factorialOf(i*2);
        }
        return sin;
    }


    public static void main(String[] args) {
        Homework4a obj = new Homework4a();
        obj.inputNum();
        obj.pow();
        obj.reverse();
        obj.isPrime();
        obj.twoNumbers();
        obj.countNumbers();
        obj.countNumbers1();
        obj.isArmstrong(371);
        obj.fun9();
        obj.func10();
        obj.random();
        obj.func12();
        System.out.println(obj.sin(1, 10));
        System.out.println(obj.cos(1,10));
    }
}
