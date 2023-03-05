package homeworks.enums.enums_1.data;

public enum Planets {
    MARS(687),
    MERCURY(88),
    VENUS(225),
    EARTH(365),
    JUPITER(4333),
    SATURN(10759),
    URANUS(30687),
    NEPTUNE(60200);
    String name = this.toString().toLowerCase();
    int yearLength;

    Planets(String name) {
        this.name = name;

    }
    Planets(int a){
        yearLength = a;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }
}
