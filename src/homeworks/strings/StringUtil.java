package homeworks.strings;

import java.util.Scanner;

public class StringUtil {


    /**
     * concatenation
     */
    void concatenation() {
        System.out.println("hello" + "world");
        System.out.println(1 + 2 + "hello");
        System.out.println("1" + 2 + "hello");
        System.out.println("hello" + 1 + 2 + "world");

        StringBuilder sc = new StringBuilder();
        sc.append("hello").append("world");
        sc.append(1 + 2 + "hello");
        sc.append("1" + 2 + "hello");
        System.out.println(sc.append("hello" + 1 + 2 + "world"));

    }

    /**
     * split
     *
     * @param txt
     */
    void literals(String txt) {

        String[] words = txt.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }


    /**
     * reverse
     */
    void reverse() {
        StringBuilder sc = new StringBuilder("hello");
        System.out.println(sc.reverse());
    }

    /**
     * exercise with token
     *
     * @param line
     * @param token
     * @return
     */
    int countSubString(String line, String token) {
        int l = 0;
        int f = token.length();
        StringBuilder sc = new StringBuilder(line);
        for (int i = 0; i < sc.length(); i++) {

            if (sc.indexOf(token) > 0)
                sc.delete(0, sc.indexOf(token) + f);
            l++;
        }

        return l;
    }

    /**
     * toUpperCase()
     */
//    void toUpperCase(String str) {
//        StringBuilder sc = new StringBuilder(str);
//        String str1 = String.valueOf(sc);
//        System.out.println(str.toUpperCase());
//        System.out.println(str1.toUpperCase());
//    }

    /**
     * line with 20 symbols
     */
    void Method20() {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        int f = 0;
        if (sc.length() < 20) {
            f += 20 - sc.length();

            for (int i = 0; i < f; i++) {
                sc = sc + "*";
            }
        }
        System.out.println(sc);

    }

    /**
     * deleting all a
     */
    void deleteA() {
        String token = "a";
        StringBuilder sc = new StringBuilder("We are living in an yellow submarine. We don't  have anything");
        for (int i = 0; i < sc.length(); i++) {
            if (sc.indexOf(token) > 0) {
                int f = sc.indexOf(token);
                sc.delete(f, f + 1);
            }
        }
        System.out.println(sc);

        String str = "We are living in an yellow submarine. We don't  have anything";
        String r = "";
        char token1 = 'a';
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != token1)
                r += str.charAt(i);

        }
        System.out.println(r);

    }

    /**
     * replacing all a
     */
    void replaceA() {
        String token = "a";
        StringBuilder sc = new StringBuilder("We are living in an yellow submarine. We don't  have anything");
        for (int i = 0; i < sc.length(); i++) {
            if (sc.indexOf(token) > 0) {
                int f = sc.indexOf(token);
                sc.replace(f, f + 1, "*");
            }
        }
        System.out.println(sc);

        String str = "We are living in an yellow submarine. We don't  have anything";
        String r = "";

        char token1 = 'a';
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != token1) {
                r += str.charAt(i);
            } else r += "*";


        }
        System.out.println(r);
    }

    /**
     * print longest word
     */
    void longestWord() {
        String str = "We are living in an yellow submarine. We don't have anything";
        String word[] = str.split(" ");
        String longest = word[0];
        for (int i = 1; i < word.length; i++) {

            if (longest.length() < word[i].length()) {
                longest = word[i];
            }

        }
        System.out.println(longest);

    }

    void indexOfToken() {
        String str = "We are living in an yellow submarine. We don't have anything";
        char token = 'a';

        int f = str.indexOf(token);
        System.out.println(f);
    }

    void printSubLine(String line, int n) {

        String str = line.substring(0, n);

        System.out.println(str);

    }

    void printSubLine(StringBuilder line, int n) {
        System.out.println(line.substring(0, n));
    }


    void split2() {
        String txt = "We, are, living, in an, yellow, submarine, We don't,  have anything";

        String[] words = txt.split(",");
        String max = words[0];
        for (int i = 1; i < words.length; i++) {
            if (max.length() < words[i].length()) {
                max = words[i];
            }
        }
        System.out.println(max);

    }


    public static void main(String[] args) {
        StringUtil obj = new StringUtil();
//        obj.concatenation();
//        obj.literals("hello world");
//        obj.reverse();
//        System.out.println(obj.countSubString("We are living in a yellow submarine. We don't  have anything", "in"));
//        obj.toUpperCase("hello");
//        obj.Method20();
//        obj.deleteA();
//        obj.replaceA();
//        obj.longestWord();
//        obj.longestWord();
//        obj.indexOfToken();
//        obj.printSubLine("We are living in an yellow submarine. We don't have anything",10);
//        obj.printSubLine(new StringBuilder("We are living in an yellow submarine. We don't have anything"),10);
//        obj.emptyOrNull();
//        obj.split2();


    }
}
