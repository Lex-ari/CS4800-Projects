package Homework_4.Pizza;

import java.util.ArrayList;

public class LittleCaesarsPizzaBuilder implements GenericPizzaChain {
    private final ArrayList<Pizza.toppings> toppingsList = new ArrayList<>();
    private final String chainName = "Little Caesars";
    private Pizza.sizes size;

    public LittleCaesarsPizzaBuilder() {

    }

    public LittleCaesarsPizzaBuilder setSize(Pizza.sizes chosenSize) {
        size = chosenSize;
        return this;
    }

    public LittleCaesarsPizzaBuilder addTopping(Pizza.toppings topping) {
        toppingsList.add(topping);
        return this;
    }

    public Pizza bakePizza() {
        return new Pizza(chainName, size, toppingsList);
    }
}
