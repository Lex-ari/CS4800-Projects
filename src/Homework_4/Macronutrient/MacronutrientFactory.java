package Homework_4.Macronutrient;

public abstract class MacronutrientFactory {

}

enum MacronutrientTypes {
    Carbs,
    Fats,
    Protein,
}

class CarbsFactory extends MacronutrientFactory {
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

class FatsFactory extends MacronutrientFactory{
    public static Fats getFat(FatOptions type){
        switch (type){
            case Avocado -> {
                return new Avocado();
            }
            case Sour_Cream -> {
                return new Sour_Cream();
            }
            case Tuna -> {
                return new Tuna();
            }
            case Peanuts -> {
                return new Peanuts();
            }
            default -> {
                return null;
            }
        }
    }
}

class ProteinFactory extends MacronutrientFactory{
    public static Protein getProtein(ProteinOptions type){
        switch (type){
            case Fish -> {
                return new Fish();
            }
            case Chicken -> {
                return new Chicken();
            }
            case Beef -> {
                return new Beef();
            }
            case Tofu -> {
                return new Tofu();
            }
            default -> {
                return null;
            }
        }
    }
}
