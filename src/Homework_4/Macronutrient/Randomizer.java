package Homework_4.Macronutrient;

import java.util.List;

public class Randomizer {

    public static Enum getRandomEnum(List<Enum> enums){
        int length = enums.size();
        int randomIndex = (int)(Math.random() * length);
        return enums.get(randomIndex);
    }
}
