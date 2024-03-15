package Homework_4.Macronutrient;

public class Driver {
    public static void main(String[] args){

        Customer a0 = new Customer("a0", "No Restrictions");
        System.out.println("Ex: No Restrictions");
        MealGenerator.generateSafeMeal(a0.getDietPlan());

        Customer b1 = new Customer("b1", "No Restrictions");
        System.out.println("Ex: No Restrictions");
        MealGenerator.generateSafeMeal(b1.getDietPlan());

        Customer c2 = new Customer("c2", "Paleo");
        System.out.println("Ex: Paleo");
        MealGenerator.generateSafeMeal(c2.getDietPlan());

        Customer d3 = new Customer("d3", "Vegan");
        System.out.println("Ex: Vegan");
        MealGenerator.generateSafeMeal(d3.getDietPlan());

        Customer e4 = new Customer("e4", "Vegan");
        System.out.println("Ex: Vegan");
        MealGenerator.generateSafeMeal(e4.getDietPlan());

        Customer f5 = new Customer("f5", "Nut Allergy");
        System.out.println("Ex: Nut Allergy");
        MealGenerator.generateSafeMeal(f5.getDietPlan());

    }
}
