package homeworks.strings;

public class StringUtil_2 {

    /**
     * Given a string, return a string made of the first 2 chars (if present), however
     * include first char only if it is 'o' and include the second only if it is 'z', so
     * "ozymandias" yields "oz"
     * @param str
     * @return
     */
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

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is
     * allowed, so "xxx" contains 2 "xx"
     * @param str
     * @param token
     */
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

    /**
     * A palindrome is a word which reads the same backward or forward. 'abcba' is
     * a palindrome. Write a method that detects if a string is a palindrome.
     * @param str
     * @return
     */
    boolean palindrome(String str) {

        StringBuilder st = new StringBuilder(str);
        String str1 = String.valueOf(st.reverse());
        if (str.equals(str1)) {
            return true;
        } else return false;
    }

    /**
     * Given a list of strings, write a method that returns a list of all strings that
     * start with the letter 'a' (lower case) and have exactly 3 letters.
     * @param str
     * @param token
     */
    void lettersA(String str, String token) {

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(token) && arr[i].length() == 3) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * Write a method that returns a comma-separated string based on a given list
     * of integers. Each element should be preceded by the letter 'e' if the number
     * is even, and preceded by the letter 'o' if the number is odd. For example, if
     * the input list is (3,44), the output should be 'o3,e44'.
     * @param num
     */
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

    /**
     * Шифр Цезаря — это базовая техника шифрования, которую Юлий
     * Цезарь использовал для безопасного общения со своими генералами.
     * Каждая буква заменяется другой буквой на N позиций вниз в
     * английском алфавите. Например, для поворота на 5 буква «с» будет
     * заменена на «h». В случае «z» алфавит вращается, и он превращается в
     * «d». Реализуйте декодер для шифра Цезаря, где N = 5.
     * @param text
     */
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

    /**
     * Given two strings, write a method that finds the longest common sub-
     * sequence
     * @param txt1
     * @param txt2
     */
    void subSequence(String txt1, String txt2) {

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

            if (max < str3[j].length()) {
                max = str3[j].length();
            }

        }

        System.out.println(max);
    }

    /**
     * Given two strings, find the number of common characters between them.
     * @param txt1
     * @param txt2
     */
    void commonChar(String txt1, String txt2) {
        StringBuilder str1 = new StringBuilder(txt1);
        String str2 = new StringBuilder(txt2).toString();

        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)) {
                    count++;

                }

            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        StringUtil_2 stringUtil2 = new StringUtil_2();
//        System.out.println(stringUtil2.firstMethod("velkoz"));
//        stringUtil2.methodTwoX("hoxxloxxx","xx");
//        stringUtil2.palindrome("abcba");
//        stringUtil2.lettersA("Ahs g aks d", "a");
//        stringUtil2.oddOrEven(3,456);
//        stringUtil2.Cesar("hellx hellz");

//        stringUtil2.palindrome_2("acca abcba adsds ads asbsa");
//        stringUtil2.subSequence("does not compiles because static methods are not allowed ","does nt compiles beca static mhods are not allwed ");
//        stringUtil2.commonChar("does not compiles because static methods are not allowed ","does nt compiles beca static mhods are not allwed ");

    }
}
