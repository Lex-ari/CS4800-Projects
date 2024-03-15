package Homework_4.Macronutrient;

public abstract class Carbs extends Macronutrient{
    abstract String getDescription();
}


class Cheese extends Carbs {
    @Override
    public String getDescription(){
        return "Cheese";
    }
}

class Bread extends Carbs {
    @Override
    public String getDescription(){
        return "Bread";
    }
}

class Lentils extends Carbs {
    @Override
    public String getDescription(){
        return "Lentils";
    }
}

class Pistachio extends Carbs {
    @Override
    public String getDescription(){
        return "Pistachio";
    }
}

