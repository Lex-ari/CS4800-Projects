package Homework_4.Macronutrient;

public class DataFactory {

    public static DietData getDietData(String type) {
        switch (type) {
            case "Carbs" -> {
                return new CarbData();
            }
            case "Fats" -> {
                return new FatsData();
            }
            case "Protein" -> {
                return new ProteinData();
            }
            default -> {
                return null;
            }
        }
    }
}
