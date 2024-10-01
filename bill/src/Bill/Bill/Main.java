package Bill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------Pizzaminia----------");
        System.out.println("Select -> 1.Veg Pizza 2.Non Veg Pizza 3.Delux Veg Pizza 4.Delux Non Veg Pizza ");

        Scanner sc = new Scanner(System.in);
        int sel = sc.nextInt();

        switch (sel) {
            case 1 -> {
                pizza vegPizza = new pizza(true);
                vegPizza.addExtraToppings();
                vegPizza.addExtraCheese();
                vegPizza.takeAway();
                vegPizza.getBill();
            }

            case 2 -> {
                pizza nonVegPizza = new pizza(false);
                nonVegPizza.addExtraToppings();
                nonVegPizza.addExtraCheese();
                nonVegPizza.takeAway();
                nonVegPizza.getBill();
            }

            case 3 -> {
                DeluxPizza veg = new DeluxPizza(true);
                veg.basePizzaPrice = 550;
                veg.addExtraCheese();
                veg.addExtraToppings();
                veg.takeAway();
                veg.getBill();
            }
                
            case 4 -> {
                DeluxPizza Nonveg = new DeluxPizza(false);
                Nonveg.basePizzaPrice = 650;
                Nonveg.addExtraCheese();
                Nonveg.addExtraToppings();
                Nonveg.takeAway();
                Nonveg.getBill();
            }

        }

    }
}

