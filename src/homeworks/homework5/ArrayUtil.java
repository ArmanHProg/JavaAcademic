package homeworks.homework5;

import java.sql.Array;
import java.util.Arrays;

public class ArrayUtil {

    // ******************************  1
    // gtnel drakan@
    //1
    void positiveArrays() {
        int[] n = new int[]{5, 10, 6, -1, 95, 48, 35, 15};
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0)
                System.out.println(n[i]);
        }
    }

    //hakarak hertakanutyun
    //2
    void reverseArray() {
        short[] s = new short[]{324, 258, 123};
        for (int i = 0; i < s.length; i++) {
            String str = Short.toString(s[i]);
            StringBuffer reverse = new StringBuffer(str).reverse();
            System.out.println(reverse);
        }
    }

    //arrayi amenamec tarr@
    //3
    void maxValue() {
        long[] l = new long[]{-4, 5, 68, 98, 4, 0, 69};
        // System.out.println(Arrays.stream(l).max()); *** variant 1
        long max = l[0];
        for (int i = 1; i < l[i]; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println(max); // *** variant 2
    }

    //amenapoqr tarr@
    //4
    void minValue() {
        float[] f = new float[]{-4.1f, 5, 68.8f, 98, 4.9f, 0, 69};

        float min = f[0];
        for (int i = 1; i < f[i]; i++) {
            if (f[i] < min) {
                min = f[i];
            }
        }
        System.out.println(min);

    }

    //arrayneri texapoxum
    //5
    void replaceArrays() {
        int[] m = new int[]{1, 5, 69, 78, 12, 45, 65};
        int[] n = new int[m.length];

        for (int i = 0; i < m.length; i++) {
            n[i] = m[i];
            System.out.println(n[i]);
        }

    }

    // arrayneri gumarum
    //6
    void sumArrays() {
        int[] m = new int[]{1, 5, 69, 78, 12, 45, 65};
        int[] n = new int[]{2, 6, 89, 45, 2, 35, 987};
        int[] k = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            k[i] = m[i] + n[i];
            System.out.println(k[i]);
        }

    }

    //ham@nknum k = 5 tvi het
    //7
    void matchArray() {
        int k = 5;
        int match = 0;
        int[] m = new int[]{1, 5, 69, 78, 5, 45, 65};
        for (int i = 0; i < m.length; i++) {
            if (m[i] == k) {
                match++;
            }
        }
        System.out.println(match);
    }

    // ************************ 2
    //todo
    //8
    void trioArrays() {




    }

    // dasavorel achman kargov
    //9
    void method() {
        int[] arr = new int[]{1, 5, 9, 8, 3, 4};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    //10
    void oddArrays() {
        int[] arr = new int[]{1, 5, 9, 8, 3, 4};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % 2 == 1) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }


    // jnjel 0-ner@
    //11
    void deleteArr() {
        int[] m = new int[]{1, 0, 6, 4, 9, 0, 0};
        int[] n = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            if (m[i] != 0) {
                n[i] = m[i];
            } else continue;
            System.out.println(n[i]);
        }
    }

    //12
    void longestSubsequence() {

    }

    //13
    void binaryArrays() {

    }

    //14
    void matrix1() {

        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {

                System.out.print(a[i][j] + " ");

            }
        }
    }

    //15
    void matrix2() {
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};
        int b[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                System.out.println(b[i][j] = a[j][i]);
            }
        }
    }

    //16
    void matrix3() {
        int a[][] = {{1, 2, 3, 5},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};
        int sum = 0;
        boolean d = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];

                }
            if (sum % 2 == 0) {
                d = true;
            } else {
                d = false;
                break;
            }
        }
        if (d) {
            System.out.println("yes");
        } else System.out.println("no");

    }



    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
//        arrayUtil.positiveArrays();
//        arrayUtil.reverseArray();
//        arrayUtil.maxValue();
//        arrayUtil.minValue();
//        arrayUtil.replaceArrays();
//        arrayUtil.sumArrays();
//        arrayUtil.matchArray();
//        arrayUtil.oddArrays();
//        arrayUtil.deleteArr();
//        arrayUtil.method();
//        arrayUtil.matrix3();
    }


}



