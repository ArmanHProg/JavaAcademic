package homeworks.exeptions.mail_excep;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailException {

    /**
     * return true when the mail is true
     * @param mail
     * @return
     */
    static boolean validateMail(String mail) {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        Matcher matcher = pattern.matcher(mail);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * catching non-validate mails
     */
    static void mailThrownException() {

        Scanner sc = new Scanner(System.in);
        System.out.println("input your mail");
        String mail = sc.next();
        try {
            if (validateMail(mail)) {
                System.out.println("Good!");
            } else {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("Error, you are entered invalid mail");
        }
    }
}
