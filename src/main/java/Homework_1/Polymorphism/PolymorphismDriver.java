package Homework_1.Polymorphism;


public class PolymorphismDriver {
    static Ship[] fleet = new Ship[3];

    public static void main(String[] args) {
        Ship boat = new Ship();
        boat.setName("Taroumaru");
        boat.setYearBuilt("1985");
        fleet[0] = boat;

        Cruiseship disney = new Cruiseship();
        disney.setName("Disney Treasure");
        disney.setYearBuilt("2023");
        disney.setMaxPassengers(8000);
        fleet[1] = disney;

        Cargoship evergreen = new Cargoship();
        evergreen.setName("Ever Given");
        evergreen.setYearBuilt("2015");
        evergreen.setTonnage(220940);
        fleet[2] = evergreen;

        for (int i = 0; i < fleet.length; i++) {
            fleet[i].printInfo();
        }
    }
}
