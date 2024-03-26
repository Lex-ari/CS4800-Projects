package Homework_4.Macronutrient;

public abstract class MacronutrientFactory {
    abstract Macronutrient getMacroNutrient(String type);
}

class CarbsFactory extends MacronutrientFactory {
    private static CarbsFactory carbsFactoryInstance = null;

    private CarbsFactory() {

    }

    public static CarbsFactory getInstance() {
        if (carbsFactoryInstance == null) {
            carbsFactoryInstance = new CarbsFactory();
        }
        return carbsFactoryInstance;
    }

    public Carbs getMacroNutrient(String type) {
        switch (type) {
            case "Cheese" -> {
                return new Cheese();
            }
            case "Bread" -> {
                return new Bread();
            }
            case "Lentils" -> {
                return new Lentils();
            }
            case "Pistachio" -> {
                return new Pistachio();
            }
            default -> {
                return null;
            }
        }
    }
}

class FatsFactory extends MacronutrientFactory {
    private static FatsFactory fatsFactoryInstance = null;

    private FatsFactory() {

    }

    public static FatsFactory getInstance() {
        if (fatsFactoryInstance == null) {
            fatsFactoryInstance = new FatsFactory();
        }
        return fatsFactoryInstance;
    }

    public Fats getMacroNutrient(String type) {
        switch (type) {
            case "Avocado" -> {
                return new Avocado();
            }
            case "Sour Cream" -> {
                return new Sour_Cream();
            }
            case "Tuna" -> {
                return new Tuna();
            }
            case "Peanuts" -> {
                return new Peanuts();
            }
            default -> {
                return null;
            }
        }
    }
}

class ProteinFactory extends MacronutrientFactory {
    private static ProteinFactory proteinFactoryInstance = null;

    private ProteinFactory() {

    }

    public static ProteinFactory getInstance() {
        if (proteinFactoryInstance == null) {
            proteinFactoryInstance = new ProteinFactory();
        }
        return proteinFactoryInstance;
    }

    public Protein getMacroNutrient(String type) {
        switch (type) {
            case "Fish" -> {
                return new Fish();
            }
            case "Chicken" -> {
                return new Chicken();
            }
            case "Beef" -> {
                return new Beef();
            }
            case "Tofu" -> {
                return new Tofu();
            }
            default -> {
                return null;
            }
        }
    }
}
