package homeworks.enums.enums_2.weekends;

import javax.swing.*;
import java.util.Scanner;

public class Weekends {


    /**
     * print this day weekend or no
     */
    public void show() {

        Scanner scanner = new Scanner(System.in);
        String nameDay = scanner.next();
        nameDay = nameDay.toUpperCase();

        if(nameDay.equals(Weekdays.SATURDAY.name()) || nameDay.equals(Weekdays.SUNDAY.name())) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Isn't weekend");
        }


    }
}
