package Homework_4.Macronutrient;

import java.util.List;
import java.util.Random;

public class MealGenerator {



    public static void generateMeal(){
        MacronutrientFactory factory = MacronutrientFactoryCreator.createFactory("Carbs");
        List meal = DataFactory.getDietData("Carbs").getSafeMacronutrients("Paleo");
        String randomMacro = Randomizer.getRandomStringFromList(meal);
        Macronutrient actualMcaro = factory.getMacroNutrient(randomMacro);
        System.out.println(actualMcaro.getDescription());
    }
}
