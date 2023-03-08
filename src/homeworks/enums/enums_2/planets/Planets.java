package homeworks.enums.enums_2.planets;

public enum Planets {

    MERCURY(1000,10001),
    VENUS(2000,20001),
    EARTH(3000,30001),
    MARS(4000,40001),
    JUPITER(5000,50001),
    SATURN(6000,60001),
    URANUS(7000,70001),
    NEPTUNE(8000,80001);

    public int mass;
    public int distance;
    public String name = this.name().toLowerCase();

     Planets(int mass, int distance) {
        this.mass = mass;
        this.distance = distance;
    }
}
