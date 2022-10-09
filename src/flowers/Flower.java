package flowers;

public abstract class Flower{
    protected Freshness fresh;
    protected int stalkLength;
    protected double cost;

    public Flower(Freshness fresh, int stalk, double cost) {
        this.fresh = fresh;
        this.stalkLength = stalk;
        this.cost = cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public int getStalkLength() {
        return stalkLength;
    }

    public Freshness getFresh() {
        return fresh;
    }

    public void setFresh(Freshness fresh) {
        this.fresh = fresh;
    }

    @Override
    public String toString() {
        return "Freshness: " + fresh + "; Stalk Length: " + stalkLength + "; Cost :" + cost;
    }

    public void setStalkLength(int stalkLength) {
        this.stalkLength=stalkLength;
    }
}
