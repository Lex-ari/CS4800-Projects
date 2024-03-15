package Homework_4.Macronutrient;

import java.util.List;

public class Randomizer {

    public static String getRandomStringFromList(List<String> list){
        int length = list.size();
        int randomIndex = (int)(Math.random() * length);
        return list.get(randomIndex);
    }
}
