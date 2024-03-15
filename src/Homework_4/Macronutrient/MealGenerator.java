package Homework_4.Macronutrient;

import java.util.List;
import java.util.Random;

public class MealGenerator {
    
    public static void generateSafeMeal(String dietType){
        MacronutrientFactory carbFactory = MacronutrientFactoryCreator.getInstance().createFactory("Carbs");
        List safeCarbs = DataFactory.getDietData("Carbs").getSafeMacronutrients(dietType);
        Macronutrient randomCarb = carbFactory.getMacroNutrient(Randomizer.getRandomStringFromList(safeCarbs));

        MacronutrientFactory proteinFactory = MacronutrientFactoryCreator.getInstance().createFactory("Protein");
        List safeProtein = DataFactory.getDietData("Protein").getSafeMacronutrients(dietType);
        Macronutrient randomProtein = proteinFactory.getMacroNutrient(Randomizer.getRandomStringFromList(safeProtein));

        MacronutrientFactory fatFactory = MacronutrientFactoryCreator.getInstance().createFactory("Fats");
        List safeFat = DataFactory.getDietData("Fats").getSafeMacronutrients(dietType);
        Macronutrient randomFat = fatFactory.getMacroNutrient(Randomizer.getRandomStringFromList(safeFat));

        System.out.println("Generated:");
        System.out.println(randomCarb.getDescription());
        System.out.println(randomProtein.getDescription());
        System.out.println(randomFat.getDescription());
        System.out.println();
    }
}
