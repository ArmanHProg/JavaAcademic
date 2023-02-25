package homeworks.primitivetypes;

public class Homework1 {

    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;

        short c = 3;
        short d = 4;

        int e = 5;
        int f = 6;

        long g = 7;
        long h = 8;

        byte min = -128;
        byte max = -127;

        short minShort = -32768;
        short maxShort = 32767;

        int minInt = -2147483648;
        int maxInt = 2147483647;

        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;

        float i = 9.1f;
        float j = 9.2f;

        double k = 9.3;
        double l = 9.4;

        float maxFloat = 3.4028235E+38F;
        float minFloat = 1.4E-45F;

        double maxDouble = 1.7976931348623157E+308;
        double minDouble = 4.9E-324;

        char n = 'a';
        char o = 'b';

        char s = 77;
        char w = 109;
        char t = 57;

        boolean p = true;
        boolean q = false;

        int year = 201;
        System.out.print(year);

        System.out.println(s + " " + w + " " + t);
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + n + " " + o + " " + i + " "
                + j + " " + k + " " + l + " " + p + " " + q + " " + max + " " + min + " " + minShort + " " + maxShort + " " + maxInt + " " + minInt + " "
                + minLong + " " + maxLong + " " + maxFloat + " " + minFloat + " " + maxDouble + " " + minDouble);

        //automatically casting

        int aa = 7;
        long bb = aa;

        System.out.println(bb);

        int myInt = 7;
        double myDouble = myInt;

        System.out.println(myDouble);

        //manual casting

        double dd = 9.78d;
        int ii = (int) dd;

        System.out.println(ii);

        int ff = 9999;
        byte gg = (byte) ff;

        System.out.println(gg);


//        long max = 3123456789l;
//        double d = 1000.00;
//        char i = 'i';
//        char j=  'j';
//        char ij = i +j; // we can't do addition in char
//        int a = 8;
//        long h = 0;
//        h = h + 8;
//        int m,n = 11;
//        m = n;

        float x = 12.345f;
        float v = 3456.091f;

        double y = 34.567839023;
        double z = 8923.1234857f;
    }
}