package flowers;

public class Tulip extends Flower {


    public Tulip(Freshness fresh, int stalk) {
        super(fresh, stalk, 32);
        switch (this.fresh) {
            case FullFresh -> setCost(getCost());
            case MidFresh -> setCost(getCost() * 0.7);
            case OldFresh -> setCost(getCost() * 0.5);
        }
    }

    @Override
    public void setFresh(Freshness fresh) {
        this.fresh = fresh;
        switch (this.fresh) {
            case FullFresh -> setCost(getCost());
            case MidFresh -> setCost(getCost() * 0.7);
            case OldFresh -> setCost(getCost() * 0.5);
        }
    }

    @Override
    public String toString() {
        return "Tulip'\n" + super.toString();
    }
}


