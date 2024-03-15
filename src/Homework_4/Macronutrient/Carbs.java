package Homework_4.Macronutrient;

public abstract class Carbs {
    abstract String getDescription();
}

enum CarbOptions {
    Cheese,
    Bread,
    Lentils,
    Pistachio,
}

class Cheese extends Carbs {
    public String getDescription(){
        return "Cheese";
    }
}

class Bread extends Carbs {
    public String getDescription(){
        return "Bread";
    }
}

class Lentils extends Carbs {
    public String getDescription(){
        return "Lentils";
    }
}

class Pistachio extends Carbs {
    public String getDescription(){
        return "Pistachio";
    }
}

