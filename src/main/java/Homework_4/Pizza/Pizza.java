package Homework_4.Pizza;

import java.util.ArrayList;

public class Pizza {
    private final String chain;
    private final sizes size;
    private final ArrayList<toppings> toppings;

    public Pizza(String chain, sizes size, ArrayList<toppings> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Chain: " + chain);
        System.out.println("Size: " + size);
        printToppings();

    }

    private void printToppings() {
        System.out.println("Toppings: ");
        for (toppings topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    public enum sizes {SMALL, MEDIUM, LARGE}

    public enum toppings {
        Pepperoni,
        Sausage,
        Mushrooms,
        Bacon,
        Onions,
        Extra_Cheese,
        Peppers,
        Chicken,
        Olives,
        Spinach,
        Tomato_and_Basil,
        Beef,
        Ham,
        Pesto,
        Spicy_Pork,
        Ham_and_Pineapple
    }
}
