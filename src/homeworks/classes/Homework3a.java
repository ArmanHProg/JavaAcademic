package homeworks.classes;

import java.math.BigInteger;
import java.util.Scanner;

public class Homework3a {


    void evenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("x is even");
        } else System.out.println("x is odd");
    }

    void positiveOrNegative(int x) {
        if (x > 0) {
            System.out.println("Your number is positive");
        } else if (x < 0) {
            System.out.println("Your number is negative");
        } else System.out.println("Your number is 0");
    }

    void func(int x) {
        if (x > 5 || x < 8) {
            System.out.println("Your number is >5 and <8");
        } else if (x > 15 || x < 20)
            System.out.println("Your number is >15 and <20");
        else System.out.println(" error");
    }

    void func1(int x) {
        if (x % 5 == 0 && x % 7 == 0) {
            System.out.println("nice ");
        }
    }

    boolean func2(int x) {
        int k = (x % 100) / 10;
        if (k == 7) return true;
        else return false;
    }

    void inCircle(int x, int y) {
        if (x < 5 && x > -5 && y < 5 && y > -5)
            System.out.println(" in  circle");
        else System.out.println("out of circle");

    }

    void biggestFrom3(int x, int y, int z) {
        int max;
        if (x > y) {
            max = x;
        } else max = y;
        if (max > z) {
            System.out.println(max);
        } else System.out.println(z);
    }

    void leapYear(int x) {
        if (x % 4 == 0 && x % 400 == 0 && x % 100 != 0) {
            System.out.println("this year is leap");
        } else System.out.println("this year is not leap");
    }//es chem haskacel pahanj@

    void printNumbers() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }

    void firstNumber(int x) {
        String str = Integer.toString(x);

        for (int i = 1; i < str.length(); i++) {
            x /= 10;

        }
        System.out.println(x);

    }

    void func3() {

        int z = 0;

       for (int x=1,y=0;x<5 && y<10;x++,y++){

           z += x + y;

        }
        System.out.println(z);
    }

    void foursquare() {

        System.out.println("*  *  *  *  *  *  *  *");
        for (int j = 0; j < 7; j++) {
            System.out.println("*                    *");
        }
        System.out.println("*  *  *  *  *  *  *  *");
    }

    void func1_N(){
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i<=N; i++){
            if (i % 5 == 0){
                sum += i;

            }

        }
        System.out.println(sum);
    }

    void func1_N1() {

            BigInteger x = new BigInteger("1");
            for (int i = 10; i < 99; i += 2)
                x = x.multiply(BigInteger.valueOf(i));
            System.out.println(x);

        }

    void func1_N2(){
        int N;
        do{Scanner scanner = new Scanner(System.in);
         N = scanner.nextInt(); }
        while (N<0);
        int min = 1;
        int max = 0;
        for (int i =1; i<N;i++){
            if (min > i) min = i;
            else max = i;
        }

        int z = (min + max)/2;
        System.out.println(z);
    }

      void func5(int x){

        int a = x%10;
        int b = x%100/10;
        int c = x%1000/100;
        int d = x%10000/1000;
        int e = x/10000;

        int sum = a+b+c+d+e;

          System.out.println(sum);

      }

    public static void main(String[] args) {
        Homework3a obj = new Homework3a();
        obj.evenOrOdd(5);
        obj.positiveOrNegative(0);
        obj.func(7);
        obj.func1(40);
        System.out.println(obj.func2(175));
        obj.inCircle(4, -5);
        obj.biggestFrom3(4, 15, 3);
        obj.leapYear(1600);
        obj.printNumbers();
        obj.firstNumber(5456);
        obj.func3();
        obj.foursquare();
        obj.func1_N();
        obj.func1_N1();
        obj.func1_N2();
        obj.func5(11111);

        //**************************
        int xx = 0;
        while (xx++ < 10) {
            if (xx == 8) break;
        }
        System.out.println(xx);

        //**************************
        int x = 2;
        int y = 5;
        while (x < 10) {
            x++;
        }
        //**************************
        int x1 = 15;
        while (x1 > 10) {
            x1--;
        }
        System.out.println(x1);

    }
}
