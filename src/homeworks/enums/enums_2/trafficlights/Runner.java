package homeworks.enums.enums_2.trafficlights;

public class Runner implements States {


    TrafficLight[] arr = TrafficLight.values();

    /**
     * chang the states of light
     */
    public void changeState() {
        for (int i = 0; i < arr.length; i++) {
         try {
             switch (arr[i]) {

                 case RED:
                     System.out.println("RED");
                     Thread.sleep(3000);
                     break;
                 case YELLOW:
                     System.out.println("YELLOW");
                     Thread.sleep(3000);
                     break;
                 case GREEN:
                     System.out.println("GREEN");
                     Thread.sleep(3000);
                     break;

             }
         }catch (InterruptedException e){
             e.printStackTrace();
         }

        }
    }


}
