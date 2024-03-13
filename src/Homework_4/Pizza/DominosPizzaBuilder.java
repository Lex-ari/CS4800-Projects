package Homework_4.Pizza;

import java.util.ArrayList;

public class DominosPizzaBuilder implements GenericPizzaChain {
    private Pizza.sizes size;
    private ArrayList<Pizza.toppings> toppingsList = new ArrayList<>();
    private String chainName = "Dominos";

    public DominosPizzaBuilder(){

    }

    public DominosPizzaBuilder setSize(Pizza.sizes chosenSize){
        size = chosenSize;
        return this;
    }

    public DominosPizzaBuilder addTopping(Pizza.toppings topping){
        toppingsList.add(topping);
        return this;
    }

    public Pizza bakePizza(){
        return new Pizza(chainName, size, toppingsList);
    }
}
