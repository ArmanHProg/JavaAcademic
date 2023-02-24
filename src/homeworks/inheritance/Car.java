package homeworks.inheritance;

public class Car {

    private int passengerCount;
    private String engineType;



    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount < 2){
            System.out.println("can not be smaller 2");
        }else {
        this.passengerCount = passengerCount; }
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if(engineType.matches("[a-zA-Z]+")){
            this.engineType = engineType;
        }else System.out.println("error");

    }
}
