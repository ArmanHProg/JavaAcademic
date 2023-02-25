package homeworks.classes;

public class Employee {
    private int id;
    private String name;
    private String department;
    private int age;
    private String gender;

    public Employee(int id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    void printEmployee(){

        System.out.println("Employee id  "+id);
        System.out.println("Employee name  "+name);
        System.out.println("Employee department  "+ department);
        System.out.println("Employee age  "+age);
        System.out.println("Employee gender  "+gender);

    }

    public static void main(String[] args) {

        Employee employee1 = new Employee(001,"Vazgen","Police",25,"male");
        employee1.printEmployee();
        Employee employee2 = new Employee(002,"Ashot","Police",25,"male");
        employee2.printEmployee();
        Employee employee3 = new Employee(003,"Anahit","Engineering",26,"female");
        employee3.printEmployee();

    }
}
