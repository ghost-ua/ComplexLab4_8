package bouquets;

import accessories.Accessory;
import flowers.Flower;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
