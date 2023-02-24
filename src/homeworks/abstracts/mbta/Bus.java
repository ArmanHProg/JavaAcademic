package homeworks.abstracts.mbta;

public class Bus extends Vehicle{
    public Bus(String rightOfWay) {
        super(rightOfWay);
    }

    @Override
    public void displayInfo() {
        System.out.println("This vehicle is a bus and its right-of-way is " + rightOfWay);

    }
}
