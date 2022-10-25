package bouquets;

import accessories.Accessory;
import flowers.Flower;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
1. Remove cost variable, use getCost method which calculate the total summary.
2. Remove makeName method and set it through constructor
3. I don't understand why are you using a hashmap for storing accessories.
    I think, List or array will be enough.
    if you want to keep an order (knowing what accessory was added first, next after the first and so on..), use Queue (FIFO) data structure OR
    even simpler, just array. You can get whatever accessory just by index. Actually, your implementation is already does that :)

    !!! Question: what difference between storing accessories in array and get any value by index AND storing them in a manner you are?
    if you can use array, just do that. If you can somehow replace any structure by array - do that, but be attentive.

    !!! Hash tables are complex, so try to avoid them for now :)

    !!! Use array data structure when you know amount of data it will contain, otherwise use List data structure

!!! Remember KISS principle: Keep It Simple. Try to not to overcomplicate/overthink.

4. Name of your methouds must be consistent. You MUST give a method a name according to WHAT EXACTLY THAT METHOD DOES
    Rename: showFlowers -> printFlowers
            showAccessories -> printAccessories

public class Bouquet {
    private String name;
    private List<Flower> flowers;
    private List<Accessories> accessories;

    public Bouquet(String name) {
        this.name = name;

        flowers = new ArrayList<>();
        accessories = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public double getCost() {
        double totalFlowerSum = flowers.stream().reduce(Integer::sum).get();
        double totalAccessoriesSum = accessories.stream().reduce(Integer::sum).get();

        return totalFlowerSum + totalAccessoriesSum;
    }

    // Other methods
    ....
}

*/

public class Bouquet {

    private String name = " ";
    private double cost;
    protected List<Flower> flowers;
    protected HashMap<Integer, Accessory> accessories;

    public Bouquet() {
        flowers = new ArrayList<>();
        accessories = new HashMap<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
        cost += flower.getCost();
    }

    public void addAccessory(Accessory accessory) {
        accessories.put(accessories.size() + 1, accessory);
        cost += accessory.getCost();
    }

    public double getCost() {
        return cost;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void showFlowers() {
        for (int i=0; i<flowers.size(); i++) {
            System.out.println("Index : " + (i+1));
            System.out.println("Flower : " + flowers.get(i));
        }
    }

    public void showAccessories() {
        for (Integer key : accessories.keySet()) {
            System.out.println("Index : " + key);
            System.out.println("Accessory : " + accessories.get(key));
        }
    }

    public HashMap<Integer, Accessory> getAccessories() {
        return accessories;
    }

    public void makeName(String type, int count) {
        this.name += type + " " + count + " ";
    }

    public String getName() {
        return this.name;
    }
}
