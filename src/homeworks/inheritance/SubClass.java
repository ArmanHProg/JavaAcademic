package homeworks.inheritance;

public class SubClass extends SuperClass{
    public String message = "hello subclass class";


    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.message);
        System.out.println(((SuperClass) subClass).message);;
    }
}
