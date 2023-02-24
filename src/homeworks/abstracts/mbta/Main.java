package homeworks.abstracts.mbta;

public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Bus("Dedicated");
        bus.displayInfo();

        Vehicle urbanRail = new UrbanRail("Shared");
        urbanRail.displayInfo();

        Vehicle commuterRail = new CommuterRail("Mixed");
        commuterRail.displayInfo();
    }
}
