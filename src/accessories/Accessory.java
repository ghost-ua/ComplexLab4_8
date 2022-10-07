package accessories;

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
