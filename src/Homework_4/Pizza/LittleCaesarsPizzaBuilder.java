package Homework_4.Pizza;

import java.util.ArrayList;

public class LittleCaesarsPizzaBuilder implements GenericPizzaChain {
    private Pizza.sizes size;
    private ArrayList<Pizza.toppings> toppingsList = new ArrayList<>();
    private String chainName = "Little Caesars";

    public LittleCaesarsPizzaBuilder(){

    }

    public LittleCaesarsPizzaBuilder setSize(Pizza.sizes chosenSize){
        size = chosenSize;
        return this;
    }

    public LittleCaesarsPizzaBuilder addTopping(Pizza.toppings topping){
        toppingsList.add(topping);
        return this;
    }

    public Pizza bakePizza(){
        return new Pizza(chainName, size, toppingsList);
    }
}
