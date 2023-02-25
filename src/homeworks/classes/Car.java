package homeworks.classes;

public class Car {

    private String model;
    private String color;
    private int currentSpeed = 0;
    private boolean sEngineStart;

    public Car(String model, String color, int currentSpeed, boolean sEngineStart) {
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.sEngineStart = sEngineStart;
    }

    void stopEngine(){};
    void startEngine(){};

    public static void main(String[] args) {
        Car car =new Car("c203","black",60,true);
        Car car1 =new Car("S505","white",0,false);
    }

}
