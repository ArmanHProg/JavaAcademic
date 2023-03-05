package homeworks.enums.enums_1;

public class Main {


    public static void main(String[] args) {


        WeekDays weekDays = WeekDays.FRIDAY;
        System.out.println(WeekDays.getDayNumber(weekDays));


        Shape shape = Shape.TRIANGLE;
        double area = shape.area(5,5);
        System.out.println(area);

        shape = Shape.CIRCLE;
        double area1 = shape.area(5);
        System.out.println(area1);

        shape = Shape.SQUARE;
        double area2 = shape.area(5, 6);
        System.out.println(area);

        double distance = Planets.EARTH.getDistanceFromSun();
        System.out.println(distance);

    }

}
