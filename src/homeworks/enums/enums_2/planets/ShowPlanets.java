package homeworks.enums.enums_2.planets;

public class ShowPlanets {

    Planets[] planets = Planets.values();


    /**
     * show the planet name , mass and distance from Sun
     */
    public void show(){
        for (int i = 0; i <planets.length ; i++) {
            System.out.println(planets[i].name + " "+ planets[i].mass + " "+ planets[i].distance);
        }
    }
}
