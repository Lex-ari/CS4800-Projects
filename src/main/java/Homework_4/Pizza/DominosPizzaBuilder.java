package Homework_4.Pizza;

import java.util.ArrayList;

public class DominosPizzaBuilder implements GenericPizzaChain {
    private final ArrayList<Pizza.toppings> toppingsList = new ArrayList<>();
    private final String chainName = "Dominos";
    private Pizza.sizes size;

    public DominosPizzaBuilder() {

    }

    public DominosPizzaBuilder setSize(Pizza.sizes chosenSize) {
        size = chosenSize;
        return this;
    }

    public DominosPizzaBuilder addTopping(Pizza.toppings topping) {
        toppingsList.add(topping);
        return this;
    }

    public Pizza bakePizza() {
        return new Pizza(chainName, size, toppingsList);
    }
}
