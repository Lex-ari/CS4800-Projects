package Homework_4;

public interface PizzaBuilder {
    public enum sizes{SMALL, MEDIUM, LARGE};
    public enum toppings{
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
    };

    PizzaBuilder setSize(sizes chosenSize);
    PizzaBuilder addTopping(toppings topping);

}
