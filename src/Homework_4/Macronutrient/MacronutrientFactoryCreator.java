package Homework_4.Macronutrient;

public class MacronutrientFactoryCreator {

    private static MacronutrientFactoryCreator FactoryCreatorInstance = null;
    private MacronutrientFactoryCreator(){

    }
    public static MacronutrientFactoryCreator getInstance(){
        if (FactoryCreatorInstance == null) {
            FactoryCreatorInstance = new MacronutrientFactoryCreator();
        }
        return FactoryCreatorInstance;
    }

    public static MacronutrientFactory createFactory(String type){
        switch (type) {
            case "Carbs" -> {
                return CarbsFactory.getInstance();
            }
            case "Fats" -> {
                return FatsFactory.getInstance();
            }
            case "Protein" -> {
                return ProteinFactory.getInstance();
            }
            default -> {
                return null;
            }
        }
    }
}
