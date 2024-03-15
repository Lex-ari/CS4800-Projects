package Homework_4.Macronutrient;

public abstract class Protein {
    abstract String getDescription();
}

enum ProteinOptions {
    Fish,
    Chicken,
    Beef,
    Tofu,
}

class Fish extends Protein {
    public String getDescription(){
        return "Fish";
    }
}

class Chicken extends Protein {
    public String getDescription(){
        return "Chicken";
    }
}

class Beef extends Protein {
    public String getDescription(){
        return "Beef";
    }
}

class Tofu extends Protein {
    public String getDescription(){
        return "Tofu";
    }
}