package homeworks.enums.enums_2.pizza;

import java.util.Scanner;

public class Pizza {

    public void show(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pizza size (small, medium, large): ");
        PizzaSize size = PizzaSize.valueOf(scanner.next().toUpperCase());
        System.out.print("Enter number of toppings: ");
        int numToppings = scanner.nextInt();

        double toppingsCost = 0;
        for (int i = 0; i < numToppings; i++) {
            System.out.printf("Enter topping (Pepperoni,Onions,Sausage,Mushrooms,Green_Peppers) "+ (i+1) + " ");
            Topping topping = Topping.valueOf(scanner.next().toUpperCase());
            toppingsCost += topping.getCost();
        }

        double totalPrice = size.getPrice() + toppingsCost;


        System.out.printf("Total price: $%.2f%n", totalPrice);
    }

}
