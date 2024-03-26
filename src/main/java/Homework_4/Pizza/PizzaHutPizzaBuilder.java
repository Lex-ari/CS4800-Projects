package Homework_4.Pizza;

import java.util.ArrayList;

public class PizzaHutPizzaBuilder implements GenericPizzaChain {
    private final ArrayList<Pizza.toppings> toppingsList = new ArrayList<>();
    private final String chainName = "Pizza Hut";
    private Pizza.sizes size;

    public PizzaHutPizzaBuilder() {

    }

    public PizzaHutPizzaBuilder setSize(Pizza.sizes chosenSize) {
        size = chosenSize;
        return this;
    }

    public PizzaHutPizzaBuilder addTopping(Pizza.toppings topping) {
        toppingsList.add(topping);
        return this;
    }

    public Pizza bakePizza() {
        return new Pizza(chainName, size, toppingsList);
    }
}
