package homeworks.abstracts.mbta;

public class UrbanRail extends Vehicle{

    public UrbanRail(String rightOfWay) {
        super(rightOfWay);
    }
    @Override
    public void displayInfo() {
        System.out.println("This vehicle is an urban rail and its right-of-way is " + rightOfWay);

    }
}
