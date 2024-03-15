package Homework_4.Macronutrient;

public class Driver {
    public static void main(String[] args){

        Customer a1 = new Customer("a0", "Paleo");
        MealGenerator.generateSafeMeal(a1.getDietPlan());



    }
}
