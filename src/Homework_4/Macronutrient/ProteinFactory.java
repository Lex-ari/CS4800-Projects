package Homework_4.Macronutrient;

public class ProteinFactory {
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
