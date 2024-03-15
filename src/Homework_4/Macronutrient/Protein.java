package Homework_4.Macronutrient;

public abstract class Protein extends Macronutrient{
    abstract String getDescription();
}

class Fish extends Protein {
    @Override
    public String getDescription(){
        return "Fish";
    }
}

class Chicken extends Protein {
    @Override
    public String getDescription(){
        return "Chicken";
    }
}

class Beef extends Protein {
    @Override
    public String getDescription(){
        return "Beef";
    }
}

class Tofu extends Protein {
    @Override
    public String getDescription(){
        return "Tofu";
    }
}