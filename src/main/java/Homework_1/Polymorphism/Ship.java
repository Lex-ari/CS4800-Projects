package Homework_1.Polymorphism;

public class Ship {
    protected String name;
    protected String yearBuilt;

    public Ship() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void printInfo() {
        String info = String.format("Name: %s, Built in: %s", name, yearBuilt);
        System.out.println(info);
    }
}

class Cruiseship extends Ship {
    private int maxPassengers;

    public Cruiseship() {
        super();
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void printInfo() {
        String info = String.format("Name: %s, Built in: %s, Max Capacity: %s passengers", name, yearBuilt, maxPassengers);
        System.out.println(info);
    }
}

class Cargoship extends Ship {
    private int tonnage;

    public Cargoship() {
        super();
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public void printInfo() {
        String info = String.format("Name: %s, Built in: %s, Max Capacity: %s tons", name, yearBuilt, tonnage);
        System.out.println(info);
    }
}