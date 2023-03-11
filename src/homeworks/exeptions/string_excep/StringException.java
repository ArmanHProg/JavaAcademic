package homeworks.exeptions.string_excep;

import java.util.Scanner;

public class StringException {

    /**
     * operations with string
     */
    public  static void operations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your word");
        StringBuilder str = new StringBuilder(sc.next());


        try {
            if (str.isEmpty() || str == null){
                throw new NullPointerException();
            }else {
                str.reverse();
                for (int i = 0; i < str.length() ; i++) {
                    if (Character.isLowerCase(str.charAt(i))) {
                        str.setCharAt(i,
                                Character.toUpperCase(str.charAt(i)));
                    }
                }
            }

        }catch (NullPointerException e){
            System.out.println("wrong input");
        }

    }

}
