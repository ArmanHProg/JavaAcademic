package homeworks.inheritance;


public class Truck extends Car {
    private int capacity = 0;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public Truck(int capacity) {
        this.capacity = capacity;
        super.setEngineType("turbo");
        super.setPassengerCount(4);
    }

    public static void main(String[] args) {
        Truck truck = new Truck(4);
        System.out.println(truck.getEngineType());
        System.out.println(truck.getPassengerCount());
    }
}
