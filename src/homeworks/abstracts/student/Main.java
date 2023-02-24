package homeworks.abstracts.student;

public class Main {
    public static void main(String[] args) {
        A studentA = new A(80, 90, 70);
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");

        B studentB = new B(75, 85, 95, 80);
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
