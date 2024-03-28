package main.java.Homework_5;

public class FoodItem implements Item {
    @Override
    public float getValue() {
        return 0;
    }
}

class Burger extends FoodItem {
    @Override
    public float getValue() {
        return 2.19f;   // The price of a McDonald's hamburger
    }
}

class Fries extends FoodItem {
    @Override
    public float getValue() {
        return 2.99f;   // The price of a McDonald's medium french fries
    }
}

class HotDog extends FoodItem {
    @Override
    public float getValue() {
        return 1.50f;   // The price of a Costco hot dog
    }
}