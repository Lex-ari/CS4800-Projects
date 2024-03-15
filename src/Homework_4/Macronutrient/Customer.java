package Homework_4.Macronutrient;

public class Customer {
    private String name;
    private DietOptions dietPlan;

    public Customer(String name, DietOptions dietPlan){
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DietOptions getDietPlan() {
        return dietPlan;
    }

    public void setDietPlan(DietOptions dietPlan) {
        this.dietPlan = dietPlan;
    }
}
