package Homework_4.Pizza;

public class ClientDriver {

    public static void main(String[] args) {
        Pizza pizza1 = new PizzaHutPizzaBuilder()
                .setSize(Pizza.sizes.MEDIUM)
                .addTopping(Pizza.toppings.Chicken)
                .addTopping(Pizza.toppings.Pepperoni)
                .addTopping(Pizza.toppings.Sausage)
                .bakePizza();
        Pizza pizza2 = new PizzaHutPizzaBuilder()
                .setSize(Pizza.sizes.SMALL)
                .addTopping(Pizza.toppings.Chicken)
                .addTopping(Pizza.toppings.Pepperoni)
                .addTopping(Pizza.toppings.Sausage)
                .addTopping(Pizza.toppings.Mushrooms)
                .addTopping(Pizza.toppings.Bacon)
                .addTopping(Pizza.toppings.Onions)
                .bakePizza();
        Pizza pizza3 = new PizzaHutPizzaBuilder()
                .setSize(Pizza.sizes.LARGE)
                .addTopping(Pizza.toppings.Chicken)
                .addTopping(Pizza.toppings.Pepperoni)
                .addTopping(Pizza.toppings.Sausage)
                .addTopping(Pizza.toppings.Mushrooms)
                .addTopping(Pizza.toppings.Bacon)
                .addTopping(Pizza.toppings.Onions)
                .addTopping(Pizza.toppings.Extra_Cheese)
                .addTopping(Pizza.toppings.Peppers)
                .addTopping(Pizza.toppings.Olives)
                .bakePizza();
        pizza1.eat();
        pizza2.eat();
        pizza3.eat();
    }
}
