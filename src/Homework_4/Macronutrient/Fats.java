package Homework_4.Macronutrient;

public abstract class Fats {
    abstract String getDescription();
}

enum FatOptions {
    Avocado,
    Sour_Cream,
    Tuna,
    Peanuts,
}

class Avocado extends Fats {
    public String getDescription(){
        return "Avocado";
    }
}

class Sour_Cream extends Fats {
    public String getDescription(){
        return "Sour_Cream";
    }
}

class Tuna extends Fats {
    public String getDescription(){
        return "Tuna";
    }
}

class Peanuts extends Fats {
    public String getDescription(){
        return "Peanuts";
    }
}
