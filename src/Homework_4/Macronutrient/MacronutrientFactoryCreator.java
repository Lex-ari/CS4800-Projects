package Homework_4.Macronutrient;

public class MacronutrientFactoryCreator {

    public static MacronutrientFactory createFactory(MacronutrientFactory.MacronutrientTypes type){
        switch (type) {
            case Carbs -> {
                return new CarbsFactory();
            }
            case Fats -> {
                return new FatsFactory();
            }
            case Protein -> {
                return new ProteinFactory();
            }
            default -> {
                return null;
            }
        }
    }
}
