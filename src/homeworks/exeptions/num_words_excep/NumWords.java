package homeworks.exeptions.num_words_excep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class NumWords {


    /**
     * read the file name and print number of words from input string
     */
    public static void reader(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input your string");
        String txt = sc.next();
        String[] s = txt.split(" ");
        int wordCount = 0;
        wordCount += s.length;

        try {
            FileReader fileReader = new FileReader(txt);
            if (txt == null || txt.isEmpty()){
                throw new  NullPointerException();
            }else {
                System.out.println(wordCount);
            }
        } catch (NullPointerException e){
            System.out.println("is empty or null");
        }catch (FileNotFoundException e){
            System.out.println("fiLe not found ");

        }


    }



}
