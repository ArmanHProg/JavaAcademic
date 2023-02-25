package homeworks.classes;

public class Homework3 {


    public static void main(String[] args) {
        int a = 8;
        int b = 6;
        System.out.println((a + b) + " " + (a - b) + " " + (a * b) + " " + (a / b) + " " + (a % b));

        double c = 6.4;
        double d = 0.03;
        System.out.println((c + d) + " " + (c - d) + " " + (c * d) + " " + (c / d) + " " + (c % d));

        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println(x + " " + y);

        int e = 10;
        int f = -88;
        boolean n1 = true;

        System.out.println(-e + " " + -f + " " + e + " " + -e + 92 + " " + !n1 + " " + !(!n1) + " " + e++ + " " + --f);

        int x1 = 3;
        int y1 = ++x1 * 5 / x1-- + --x1;
        System.out.println("x1 is " + x1);
        System.out.println("y1 is " + y1);

        int x2 = (int) 1.0;
        System.out.println(x2);

        short y2 = (short) 1921222;
        System.out.println(y2);

        System.out.print(2147483647 + 1);

        long y3 = (x = 3);
        System.out.println(y3);

        boolean y4 = false;
        boolean x3 = (y4 = true);
        System.out.println(x3);

        int aa = 10;
        int bb = 20;

        System.out.println(aa > bb);
        System.out.println(aa <= bb);
        System.out.println(aa >= bb);
        System.out.println(aa < bb);

        float yy = 2.1f;

        byte xx1 = 5;
        byte yy1 = 10;
        byte zz1 = (byte) (x + y);

        short xx2 = 10;
        short yy2 = 3;
        short zz2 = (short) (x * y);

        long xx3 = 10L;
        int yy3 = 5;
        yy3 = (int) (yy3 * xx3);

        int k = 5;
        int l = 10;
        int z = k;
        k = l;
        l = z;


        int u = 5;
        int i = 10;

        u = u - i;
        i = u + i;
        u = -u + i;


        a = 8;
        b = 3;

        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(a | b);
        System.out.println(~a);
        System.out.println(true || (a < 4));
        System.out.println((b >= 6) || (++a <= 7));
        System.out.println((a < b) ? a : b);
        System.out.println(b ^ b);

        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);


        int v = 5;
        int g = 0;
        for (int p = 1; p < 9; p ++ ){
            for (int n  = 1; n<17; n++){
                g += v; }
        }
        System.out.println(g);


        // 1-100 sum

        int ss = 1;
        int pp =100;

        double dd = (double) (ss+pp)/2*100;
        System.out.println(dd);






    }

    
}
