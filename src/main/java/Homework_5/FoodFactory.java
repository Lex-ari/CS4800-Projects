package main.java.Homework_5;

public class FoodFactory {
    private static FoodFactory foodFactoryInstance;

    private FoodFactory(){

    }

    public static FoodFactory getFoodFactoryInstance(){
        if (foodFactoryInstance == null){
            foodFactoryInstance = new FoodFactory();
        }
        return foodFactoryInstance;
    }

    public static Item getFoodItem(String type){
        switch (type){
            case "Burger":
                return new Burger();
            case "Hot Dog":
                return new HotDog();
            case "Fries":
                return new Fries();
            default:
                return null;
        }
    }

    public static Item addAdditionalCostToItem(String type, Item foodItem) {
        switch (type) {
            case "Lettuce":
                return new Lettuce(foodItem);
            case "Cheese":
                return new Cheese(foodItem);
            case "Ketchup":
                return new Ketchup(foodItem);
            case "Mayonnaise":
                return new Mayonnaise(foodItem);
            case "Bacon":
                return new Bacon(foodItem);
            case "Avacado":
                return new Avacado(foodItem);
            case "Loyalty":
                return new Loyalty(foodItem);
            default:
                return null;
        }
    }
}
