package homeworks.abstracts.student;

public class B extends Marks{

    private double mark1,mark2,mark3,mark4;

    public B(double mark1, double mark2, double mark3, double mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }


    @Override
    double getPercentage() {
        return (mark1+mark2+mark3+mark4)/4;
    }
}
