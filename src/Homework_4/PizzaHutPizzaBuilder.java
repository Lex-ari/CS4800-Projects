package Homework_4;

import java.util.List;

public class PizzaHutPizzaBuilder implements PizzaBuilder {
    private sizes size;
    private List<toppings> toppingsList;

    public PizzaHutPizzaBuilder(){

    }

    public PizzaBuilder setSize(sizes chosenSize){
        size = chosenSize;
        return this;
    }

    public PizzaBuilder addTopping(toppings topping){
        toppingsList.add(topping);
        return this;
    }


}
