package main.java.Homework_5;

public class additionalItem implements Item {
    protected Item decoratedItem;
    public additionalItem(Item item) {
        this.decoratedItem = item;
    }

    @Override
    public float getValue() {
        return decoratedItem.getValue() + 0;
    }
}

class Lettuce extends additionalItem {
    public Lettuce(Item item) {
        super(item);
    }

    @Override
    public float getValue() {
        return decoratedItem.getValue() + 0;
    }
}

class Cheese extends additionalItem {
    public Cheese(Item item) {
        super(item);
    }

    @Override
    public float getValue() {
        return decoratedItem.getValue() + 0.50f;
    }
}
class Ketchup extends additionalItem {
    public Ketchup(Item item) {
        super(item);
    }

    @Override
    public float getValue() {
        return decoratedItem.getValue() + 0.50f;
    }
}

class Mayonnaise extends additionalItem {
    public Mayonnaise(Item item) {
        super(item);
    }

    @Override
    public float getValue() {
        return decoratedItem.getValue() + 0.50f;
    }
}

class Bacon extends additionalItem {
    public Bacon(Item item) {
        super(item);
    }

    @Override
    public float getValue() {
        return decoratedItem.getValue() + 0.50f;
    }
}

class Avacado extends additionalItem {
    public Avacado(Item item) {
        super(item);
    }

    @Override
    public float getValue() {
        return decoratedItem.getValue() + 3.00f;    //lol rip
    }
}

class Loyalty extends additionalItem {
    public Loyalty(Item item) {
        super(item);
    }

    @Override
    public float getValue() {
        return decoratedItem.getValue() * 0.80f;
    }
}


