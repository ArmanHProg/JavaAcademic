package homeworks.classes;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int calculateArea(int length, int width){
    int makeres;
    makeres = length * width;
    return makeres;

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(14,5);
        System.out.println(rectangle.calculateArea(rectangle.length, rectangle.width));
    }
}
