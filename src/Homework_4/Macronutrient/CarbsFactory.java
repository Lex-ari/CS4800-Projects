package Homework_4.Macronutrient;

public class CarbsFactory {
    public static Carbs getCarb(CarbOptions type){
        switch (type){
            case Cheese -> {
                return new Cheese();
            }
            case Bread -> {
                return new Bread();
            }
            case Lentils -> {
                return new Lentils();
            }
            case Pistachio -> {
                return new Pistachio();
            }
            default -> {
                return null;
            }
        }
    }
}
