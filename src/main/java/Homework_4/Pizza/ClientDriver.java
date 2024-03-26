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

        System.out.println("\n PART 2 \n");
        /**
         * Part 2
         */
        Pizza ph1 = new PizzaHutPizzaBuilder()
                .setSize(Pizza.sizes.LARGE)
                .addTopping(Pizza.toppings.Chicken)
                .addTopping(Pizza.toppings.Pepperoni)
                .addTopping(Pizza.toppings.Sausage)
                .bakePizza();
        Pizza ph2 = new PizzaHutPizzaBuilder()
                .setSize(Pizza.sizes.SMALL)
                .addTopping(Pizza.toppings.Chicken)
                .addTopping(Pizza.toppings.Pepperoni)
                .bakePizza();
        Pizza lc1 = new LittleCaesarsPizzaBuilder()
                .setSize(Pizza.sizes.MEDIUM)
                .addTopping(Pizza.toppings.Chicken)
                .addTopping(Pizza.toppings.Pepperoni)
                .addTopping(Pizza.toppings.Sausage)
                .addTopping(Pizza.toppings.Mushrooms)
                .addTopping(Pizza.toppings.Bacon)
                .addTopping(Pizza.toppings.Onions)
                .addTopping(Pizza.toppings.Extra_Cheese)
                .addTopping(Pizza.toppings.Peppers)
                .bakePizza();
        Pizza lc2 = new LittleCaesarsPizzaBuilder()
                .setSize(Pizza.sizes.SMALL)
                .addTopping(Pizza.toppings.Chicken)
                .addTopping(Pizza.toppings.Pepperoni)
                .addTopping(Pizza.toppings.Sausage)
                .addTopping(Pizza.toppings.Mushrooms)
                .addTopping(Pizza.toppings.Bacon)
                .addTopping(Pizza.toppings.Onions)
                .bakePizza();
        Pizza d1 = new DominosPizzaBuilder()
                .setSize(Pizza.sizes.SMALL)
                .addTopping(Pizza.toppings.Chicken)
                .bakePizza();
        Pizza d2 = new DominosPizzaBuilder()
                .setSize(Pizza.sizes.LARGE)
                .addTopping(Pizza.toppings.Chicken)
                .addTopping(Pizza.toppings.Pepperoni)
                .addTopping(Pizza.toppings.Sausage)
                .bakePizza();

        ph1.eat();
        ph2.eat();
        lc1.eat();
        lc2.eat();
        d1.eat();
        d2.eat();
    }
}
