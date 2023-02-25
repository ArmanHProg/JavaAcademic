package homeworks.classes;

public class City {

    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public static void main(String[] args) {

        City city = new City("Moscow",12410000);
        City city1 = new City("Yerevan",1075000);
        City city2 = new City("New York",18819000);
        City city3 = new City("Paris",10901000);

    }
}