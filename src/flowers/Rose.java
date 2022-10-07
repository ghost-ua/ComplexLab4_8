package flowers;

public class Rose extends Flower {
    public Rose(Freshness fresh, int stalk) {
        super(fresh, stalk, 30);
        switch (this.fresh) {
            case FullFresh -> setCost(getCost());
            case MidFresh -> setCost(getCost() * 0.8);
            case OldFresh -> setCost(getCost() * 0.5);
        }
    }

    @Override
    public void setFresh(Freshness fresh) {
        this.fresh = fresh;
        switch (this.fresh) {
            case FullFresh -> setCost(getCost());
            case MidFresh -> setCost(getCost() * 0.8);
            case OldFresh -> setCost(getCost() * 0.5);
        }
    }

    @Override
    public String toString() {
        return "Rose'\n" + super.toString();
    }
}


