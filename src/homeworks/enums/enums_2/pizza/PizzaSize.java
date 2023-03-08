package homeworks.enums.enums_2.pizza;

public enum PizzaSize {
    SMALL(6.99),
    MEDIUM(8.99),
    LARGE(10.99);


    private double price;

    private PizzaSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
