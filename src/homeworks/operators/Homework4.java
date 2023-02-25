package homeworks.operators;

import java.util.Random;

public class Homework4 {


    boolean riceBags(int x, int y, int z) {

        int a = 5;
        int b = 1;

        if ((x * a + y * b) < z) {
            return false;
        } else if (z % 5 > y) return false;
        else return true;
    }

    void factor(int a) {
        int x = 1;
        for (int i = 2; i < a; i++) {
            if (a % i == 0 && this.isPrime(i)) x = i;

        }
        System.out.println(x);
    }

    public boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    void random() {
        Random random = new Random();
        int x = random.nextInt(101);
        if (x % 2 == 0) {
            System.out.println("even");
        } else System.out.println("odd");


    }

    public void random2() {
        int i = 0;
        int x1 = rand();
        int min = x1, max = x1;

        while (i < 10) {
            i++;
            x1 = rand();
            min = min > x1 ? x1 : min;
            max = max < x1 ? x1 : max;
        }

        System.out.println("max - " + max);
        System.out.println("min - " + min);
    }

    public int rand() {
        Random my = new Random();
        return my.ints(1, 101).findFirst().getAsInt();
    }


    public static void main(String[] args) {
        Homework4 obj = new Homework4();
        System.out.println(obj.riceBags(3, 1, 17));
        obj.factor(455);
        obj.random();
        obj.random2();

    }

}
