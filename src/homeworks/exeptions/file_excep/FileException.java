package homeworks.exeptions.file_excep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileException {

    /**
     * catching FileNotFoundException
     * @throws FileNotFoundException
     */
    public static void readFile() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("input file name");
        String fileName = sc.next();

      try {
            FileReader fileReader = new FileReader(fileName);
          System.out.println(fileReader);

      }catch (FileNotFoundException e){
          System.out.println("file not found");
      }

    }



}
