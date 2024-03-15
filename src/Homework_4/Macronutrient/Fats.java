package Homework_4.Macronutrient;

public abstract class Fats extends Macronutrient{
    abstract String getDescription();
}



class Avocado extends Fats {
    @Override
    public String getDescription(){
        return "Avocado";
    }
}

class Sour_Cream extends Fats {
    @Override
    public String getDescription(){
        return "Sour Cream";
    }
}

class Tuna extends Fats {
    @Override
    public String getDescription(){
        return "Tuna";
    }
}

class Peanuts extends Fats {
    @Override
    public String getDescription(){
        return "Peanuts";
    }
}
