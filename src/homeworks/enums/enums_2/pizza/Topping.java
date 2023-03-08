package homeworks.enums.enums_2.pizza;

public enum Topping {
    PEPPERONI(0.75),
    MUSHROOMS(0.50),
    ONIONS(0.25),
    SAUSAGE(1.00),
    GREEN_PEPPERS(0.50);


    private double cost;

    private Topping(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
