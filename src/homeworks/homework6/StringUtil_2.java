package homeworks.homework6;

import java.util.Arrays;

public class StringUtil_2 {


    String firstMethod(String str) {
        String[] arr = str.split("");
        str = "";

        while (true) {
            if (arr[0].equals("o")) {
                str += "o";
                if (arr[1].equals("z")) {
                    str += "z";
                    break;
                }
                break;
            } else {
                str += arr[0] + arr[1];
                break;
            }
        }
        return str;

    }

    void methodTwoX(String str, String token) {

        int count = 0;


        for (int i = 0; i < str.length() - 2; i++) {
            String x = str.substring(i, i + 2);
            if (x.equals(token)) {
                count++;
            }

        }
        if (str.endsWith("xx")) {
            count++;
        }
        System.out.println(count);
    }

    boolean palindrome(String str) {

        StringBuilder st = new StringBuilder(str);
        String str1 = String.valueOf(st.reverse());
        if (str.equals(str1)) {
            return true;
        } else return false;
    }


    void lettersA(String str, String token) {

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(token) && arr[i].length() == 3) {
                System.out.println(arr[i]);
            }
        }
    }


    void oddOrEven(int... num) {
        String str = "";
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                str += "e" + num[i] + ",";
            } else {
                str += "o" + num[i] + ",";
            }
        }
        System.out.println(str.substring(0, str.length() - 1));

    }

    void Cesar(String text) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] arr = alphabet.split("");
        String[] arr1 = text.split("");

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (arr1[i].equals(arr[j])) {
                    if (j > 21) {
                        System.out.println(arr1[i].replace(arr1[i], arr[j - 21]));
                    } else {
                        System.out.print(arr1[i].replace(arr1[i], arr[j + 5]));
                    }
                }
            }
        }

    }
    //todo
//    void palindrome_2(String str) {
//        String[] arr = str.split(" ");
//        String[] arr1 = new String[arr.length];
//        int k = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (palindrome(arr[i])) {
//                arr1[k].replace(null,arr[i]);
//                k++;
//            }
//        }
//        int max = arr1[0].length();
//        for (int i = 1; i <arr1.length; i++) {
//
//            if (max < arr1[i].length()){
//                max = arr1[i].length();
//            }
//        }
//        System.out.println(max);
//    }

    void subSequence(String txt1, String txt2){

        String[] str1 = txt1.split(" ");
        String[] str2 = txt2.split(" ");
        StringBuilder sc = new StringBuilder("");
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {

                if (str1[i].equals(str2[j])) {
                    sc.append(str1[i] + " ");
                }
            }
        }
          String s = sc.toString();
        String[] str3 = s.split(" ");
        int max = str3[0].length();
            for (int j = 0; j < str3.length; j++) {

                if (max < str3[j].length()){
                    max = str3[j].length();
                }

            }

        System.out.println(max);
    }


    void commonChar(String txt1, String txt2){
        StringBuilder str1 = new StringBuilder(txt1);
        String str2 = new StringBuilder(txt2).toString();

        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j) ){
                    count++;

                }

            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        StringUtil_2 stringUtil2 = new StringUtil_2();
//        System.out.println(stringUtil2.firstMethod("velkoz"));
//        stringUtil2.methodTwoX("loxxloxxx","xx");
//        stringUtil2.palindrome("abcba");
//        stringUtil2.lettersA("Ahs g aks d", "a");
//        stringUtil2.oddOrEven(3,456);
//        stringUtil2.Cesar("hellx hellz");

//        stringUtil2.palindrome_2("acca abcba adsds ads asbsa");
//        stringUtil2.subSequence("does not compiles because static methods are not allowed ","does nt compiles beca static mhods are not allwed ");
        stringUtil2.commonChar("does not compiles because static methods are not allowed ","does nt compiles beca static mhods are not allwed ");

    }
}
