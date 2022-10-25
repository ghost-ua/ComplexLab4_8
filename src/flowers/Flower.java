package flowers;

/* 
1. Make constructor protected and initialize all properties with constructor of a derived class.
2. Remove all 'settters' methods: setCost, setFresh. Let constructor does initialize all of your data.
Keep Flower structure immutable (no changeable during runtime)
3. I would recomment to get rid of 'Freshness' enum and keep freshness state of flower with date time structure.
For example, you can track freshness state by the following rules:
    - FullFresh (today's day - 2 days ago). For example, if a flower's day is less than today's day minus two then the flower is a mid-fresh.
      (date.now() - date.now().minusDays(2))
    - MidFresh (today's day - 5 days ago): (date.now() - date.now().minusDays(5))
    - OldFresh (date.now() - date.now().minusDays(7))
Also, it would be much easier to sort and get flowers by freshness with date structure.

!!! If you want to know that type of freshness flower is then you can create additional method:
protected Freshness getFreshness() {
    Date flowerDate = this.date;
    Date today = Date.getDate();

    if(today - flowerDate < 2)
        return Freshness.FullFresh;
    else if(today - flower < 5)
        return Freshness.MidFresh;
    else return Freshness.OldFresh;
}

public abstract class Flower
{
    protected Date date;
    protected int stalkLength;
    protected double cost;

    protecterd Flower(Date date, int stalkLength, double cost) {
        this.date = date;
        this.stalkLength = stalkLength;
        this.cost = cost;

        // Every derived class must have its own implentation of gettings a price,
        // because price depends on freshness and freshness for each type of flower (rose, tupil) is different.
        // tulip withers (вяне) faster than the rose.
        public abstract double getCost() ...
        public Date getFreshDate() ...
        public int getStalkLength() ...

        (see above) protected Freshness getFreshness() ...
    }
}

!!!!!!
Remember, if you want to have methods that change a state of an object (setters), it's better to make them protected and use in constructors ONLY!
*/

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
