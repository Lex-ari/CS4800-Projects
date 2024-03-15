package Homework_4.Macronutrient;

import java.util.Arrays;
import java.util.List;

enum dietOptions{
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

    protected List acceptableCarbs;
    protected List acceptableFats;
    protected List acceptableProteins;

    protected List removeListAfromListB(List A, List B) {
        List returnCopy = List.copyOf(A);
        for (Object object : A) {
            returnCopy.remove(object);
        }
        return returnCopy;
    }
}


class CarbsDietData extends DietData{
    private static DietData carbsDataInstance = null;
    private CarbsDietData(Enum[] dietRestriction){
        List bannedItems = Arrays.asList(dietRestriction);
        acceptableCarbs = removeListAfromListB(Arrays.asList(CarbOptions.values()), bannedItems);
        acceptableFats = removeListAfromListB(Arrays.asList(FatOptions.values()), bannedItems);
        acceptableProteins = removeListAfromListB(Arrays.asList(ProteinOptions.values()), bannedItems);
    }

    private CarbsDietData(){

    }

    public static DietData getInstance(){
        if (carbsDataInstance == null){
            carbsDataInstance = new CarbsDietData();
        }
        return carbsDataInstance;
    }



}
