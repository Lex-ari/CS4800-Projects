package Homework_4.Macronutrient;

public class FatsFactory {
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
