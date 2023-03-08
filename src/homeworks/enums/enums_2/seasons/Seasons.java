package homeworks.enums.enums_2.seasons;

public enum Seasons {

    SPRING(10  ,19),
    SUMMER(30,45),
    AUTUMN(20,29),
    WINTER(-100,9);


    public int minTemp;
    public int maxTemp;

    Seasons(int minTemp, int maxTemp) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }
}
