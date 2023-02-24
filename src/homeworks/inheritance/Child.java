package homeworks.inheritance;

public class Child extends Parent {
    public void showMessage(){
        System.out.println("hello child class");
    }


    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.showMessage();
        Child child = new Child();
        child.showMessage();
    }
}
