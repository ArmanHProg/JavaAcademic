package homeworks.enums.enums_1;

public enum Planets {
    MERCURY(57.9),
    VENUS(108.2),
    EARTH(149.6),
    MARS(227.9),
    JUPITER(778.3),
    SATURN(1427.0),
    URANUS(2871.0),
    NEPTUNE(4497.1);

    private final double distanceFromSun; // distance from sun in million kilometers


    Planets(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}
