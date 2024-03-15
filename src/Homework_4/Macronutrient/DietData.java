package Homework_4.Macronutrient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DietData {
    public static String[] carbList = {
            "Cheese",
            "Bread",
            "Lentils",
            "Pistachio",
    };
    public static String[] fatList = {
            "Avocado",
            "Sour Cream",
            "Tuna",
            "Peanuts",
    };
    public static String[] proteinList = {
            "Fish",
            "Chicken",
            "Beef",
            "Tofu",
    };


    protected static String[] noRestrictionBan = {};
    protected static String[] paleoBan = {
            "Cheese",
            "Bread",
            "Lentils",
            "Tofu",
            "Sour Cream",
    };
    protected static String[] veganBan = {
            "Fish",
            "Chicken",
            "Beef",
            "Cheese",
            "Sour Cream",
    };
    protected static String[] nutBan = {
            "Peanuts",
            "Pistachio",
    };

    protected static List removeListAfromListB(List A, List B) {
        List returnCopy = new ArrayList(List.copyOf(A));
        for (Object object : B) {
            returnCopy.remove(object);
        }
        return returnCopy;
    }

    abstract List getSafeMacronutrients(String options);
}

class CarbData extends DietData {
    @Override
    public List getSafeMacronutrients(String option){
        List macronutrientOptions = Arrays.asList(carbList);
        switch (option){
            case "No Restrictions" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(noRestrictionBan));
            }
            case "Paleo" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(paleoBan));
            }
            case "Vegan" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(veganBan));
            }
            case "Nut Allergy" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(nutBan));
            }
            default -> {
                return null;
            }
        }
    }
}

class FatsData extends DietData {
    @Override
    public List getSafeMacronutrients(String option){
        List macronutrientOptions = Arrays.asList(fatList);
        switch (option){
            case "No Restrictions" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(noRestrictionBan));
            }
            case "Paleo" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(paleoBan));
            }
            case "Vegan" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(veganBan));
            }
            case "Nut Allergy" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(nutBan));
            }
            default -> {
                return null;
            }
        }
    }
}

class ProteinData extends DietData {
    @Override
    public List getSafeMacronutrients(String option){
        List macronutrientOptions = Arrays.asList(proteinList);
        switch (option){
            case "No Restrictions" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(noRestrictionBan));
            }
            case "Paleo" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(paleoBan));
            }
            case "Vegan" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(veganBan));
            }
            case "Nut Allergy" -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(nutBan));
            }
            default -> {
                return null;
            }
        }
    }
}