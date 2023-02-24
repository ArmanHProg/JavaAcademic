package homeworks.abstracts.mbta;

public class CommuterRail extends Vehicle{

    public CommuterRail(String rightOfWay) {
        super(rightOfWay);
    }

    @Override
    public void displayInfo() {
        System.out.println("This vehicle is a commuter rail and its right-of-way is " + rightOfWay);
    }
}
