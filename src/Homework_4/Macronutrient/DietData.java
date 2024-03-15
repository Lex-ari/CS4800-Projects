package Homework_4.Macronutrient;

import java.util.Arrays;
import java.util.List;

enum DietOptions {
    No_Restriction,
    Paleo,
    Vegan,
    Nut_Allergy,
}

public abstract class DietData {
    protected static Enum[] noRestrictionBan = {};
    protected static Enum[] paleoBan = {
            CarbOptions.Cheese,
            CarbOptions.Bread,
            CarbOptions.Lentils,
            ProteinOptions.Tofu,
            FatOptions.Sour_Cream,
    };
    protected static Enum[] veganBan = {
            ProteinOptions.Fish,
            ProteinOptions.Chicken,
            ProteinOptions.Beef,
            CarbOptions.Cheese,
            FatOptions.Sour_Cream,
    };
    protected static Enum[] nutBan = {
            FatOptions.Peanuts,
    };

    protected List removeListAfromListB(List A, List B) {
        List returnCopy = List.copyOf(A);
        for (Object object : A) {
            returnCopy.remove(object);
        }
        return returnCopy;
    }

    abstract List getSafeMacronutrients(DietOptions options);
}

class CarbData extends DietData {
    @Override
    public List getSafeMacronutrients(DietOptions option){
        List macronutrientOptions = Arrays.asList(CarbOptions.values());
        switch (option){
            case No_Restriction -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(noRestrictionBan));
            }
            case Paleo -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(paleoBan));
            }
            case Vegan -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(veganBan));
            }
            case Nut_Allergy -> {
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
    public List getSafeMacronutrients(DietOptions option){
        List macronutrientOptions = Arrays.asList(FatOptions.values());
        switch (option){
            case No_Restriction -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(noRestrictionBan));
            }
            case Paleo -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(paleoBan));
            }
            case Vegan -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(veganBan));
            }
            case Nut_Allergy -> {
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
    public List getSafeMacronutrients(DietOptions option){
        List macronutrientOptions = Arrays.asList(ProteinOptions.values());
        switch (option){
            case No_Restriction -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(noRestrictionBan));
            }
            case Paleo -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(paleoBan));
            }
            case Vegan -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(veganBan));
            }
            case Nut_Allergy -> {
                return removeListAfromListB(macronutrientOptions, Arrays.asList(nutBan));
            }
            default -> {
                return null;
            }
        }
    }
}