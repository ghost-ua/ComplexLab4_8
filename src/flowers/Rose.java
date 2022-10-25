package flowers; 

// Set all values through public constructor.
/*

!!! The rose structure is confusing by settings a cost of 30.
Since you decided to make two another derived classes: RedRose and WhiteRose, you know the actual price of each of these,
but what price of 30 is really means for a Rose? In that case you need to make a protected constructor and set values through Red and White rose classes.

public class Rose extends Flower {
    protected Rose(Date freshDate, int stalk, double cost) {
        super(freshDate, stalk, cost);
    }

    // Define some shared logic for Red and White roses
    protected abstract double getPrice();
}

public class WhiteRose extends Rose {
    private const double PRICE = 32;

    public WhiteRose(Date freshDate, int stalkLength) {
        super(freshDate, stalkLength, PRICE);
    }

    @Override
    public doudle getPrice() {
        Freshness freshness = getFreshness();

        switch(getFreshness) {
            Freshness.FullFresh -> PRICE + 2;
            Freshness.MidFresh -> PRICE - 2;
            Freshness.OldFresh -> PRICE - 5;
        }
    }

    @Override 
    public Freshness getFreshness() {
        ...
    }
}

public class BlackRose extends Rose {
    private const double PRICE = 40;

    public WhiteRose(Date freshDate, int stalkLength) {
        super(freshDate, stalkLength, PRICE);
    }
}

BUT!!! You can simplify that hierarchy just by defining, for example, RoseColor enum:
enum RoseColor {
    Red,
    White,
    ...
}

For making a hierarchy of roses it would be better to check/google types of roses:
https://uk.wikipedia.org/wiki/%D0%A2%D1%80%D0%BE%D1%8F%D0%BD%D0%B4%D0%B0 -> Види

Eventually, you will get something like this:

public class Blanda extends Rose {
    // constructor
    .ctor()

    // define states (fields) specific ONLY FOR THAT TYPE OF ROSES
}

// see above
public class Gallica extends Rose {
    ...
}

!!! Follow the same rules for Tulip structure and it's derived classes.

*/

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
