package accessories;

/*
1. Make constructor protected and remove Color enum. What if I want to a pin (булавка) in a bouquet as accessory. 
    I don't think that color is really has a mean here. 
    It would be better to use a Color enum only in place where it's needed: strip.
    Having a price will be enough.

2. Remove setter methods or make them protected (see Flower comments)

public abstract class Accessory {
    protected double price;

    protected Accessory(double price) {
        this.price = price;
    }

    // the same principle as for Flower structure
    // abstract because when we need to get a price it depends on an exact accessory: strip, bow and so on;
    public abstract double getPrice();
}

public class Strip extends Accessory {
    private const double PRICE = 15;

    private Color color;

    public Strip(Color color) {
        super(PRICE);
    }

    @Override
    public double getPrice() {
        switch(color) {
            Color.Red -> PRICE + 5;
            Color.Green -> PRICE + 7;
            ...
        }
    }
}

!!! The same for other classes

*/

public abstract class Accessory {
    protected Color color;
    protected double cost;

    public Accessory(Color color, double cost) {
        this.color = color;
        this.cost = cost;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Color: " + color + "; Cost: " + cost;
    }
}
