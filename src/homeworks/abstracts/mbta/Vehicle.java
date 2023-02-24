package homeworks.abstracts.mbta;

public abstract class Vehicle {
    protected String rightOfWay;

    public Vehicle(String rightOfWay) {
        this.rightOfWay = rightOfWay;
    }

    public abstract void displayInfo();
}
