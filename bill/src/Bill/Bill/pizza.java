package Bill;

import java.util.Scanner;

public class pizza {
    protected int price;
    private Boolean veg;

    protected int extraCheesePrice = 100;
    protected int extraToppingsPrice = 150;
    protected int backPackPrice = 20;

    protected int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    Scanner sc = new Scanner(System.in);

    public pizza(Boolean veg) {
        this.veg = veg;

        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;

    }

    public void addExtraCheese() {
        System.out.println("Extra Cheese : (y/n)? -> ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case ('y') -> {
                isExtraCheeseAdded = true;
                this.price += extraCheesePrice;
            }

            case ('n') -> isExtraCheeseAdded = false;
        }
    }

    public void addExtraToppings() {
        System.out.println("Want Extra Toppings (y/n)? -> ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case ('y') -> {
                isExtraToppingsAdded = true;
                this.price += extraToppingsPrice;
            }

            case ('n') -> isExtraToppingsAdded = false;
        }

    }

    public void takeAway() {
        System.out.println("Want Take Away (y/n)? ->");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        switch (ch) {
            case ('y') -> {
                isOptedForTakeAway = true;
                this.price += backPackPrice;
            }

            case ('n') -> isOptedForTakeAway = false;
        }
    }

    public void getBill() {
        String bill = " ";

        System.out.println("Pizza : " + basePizzaPrice );
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese : " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings : " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take Away : " + backPackPrice + "\n";
        }
        bill += "\nTotal Amount : " + this.price + "\n";

        System.out.println(bill);
        System.out.println("\n\nThank you!!!!!  \nVisit Again >>>>");
        System.out.println("-----------------------");

    }

}
 