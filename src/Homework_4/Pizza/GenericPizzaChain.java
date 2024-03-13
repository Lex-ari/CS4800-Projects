package Homework_4.Pizza;

public interface GenericPizzaChain {
    GenericPizzaChain setSize(Pizza.sizes size);
    GenericPizzaChain addTopping(Pizza.toppings topping);

    Pizza bakePizza();
}
