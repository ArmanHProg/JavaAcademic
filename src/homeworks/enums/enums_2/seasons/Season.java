package homeworks.enums.enums_2.seasons;

import java.util.Scanner;

public class Season {

    Seasons[] season = Seasons.values();


    /**
     * @Print the season, when user input temperature
     */
    public void print() {
        System.out.println("Enter temperature");
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();

        for(int i = 0; i<season.length; i++) {
            if(temperature >= season[i].minTemp && temperature <= season[i].maxTemp) {
                System.out.println(season[i].name());
            }
        }

    }



}
