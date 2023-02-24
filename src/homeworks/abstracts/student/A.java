package homeworks.abstracts.student;

public class A extends Marks{

    private double mark1,mark2,mark3;

    public A(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    double getPercentage() {
        return (mark1+mark2+mark3)/3 ;
    }
}
