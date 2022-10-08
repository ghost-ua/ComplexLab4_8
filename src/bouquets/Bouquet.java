package bouquets;

import accessories.Accessory;
import flowers.Flower;

import java.util.HashMap;

public class Bouquet {

    private String name = " ";
    private double cost;
    protected HashMap<Integer, Flower> flowers;
    protected HashMap<Integer, Accessory> accessories;

    public Bouquet() {
        flowers = new HashMap<>();
        accessories = new HashMap<>();
    }

    public void addFlower(Flower flower) {
        flowers.put(flowers.size() + 1, flower);
        cost += flower.getCost();
    }

    public void addAccessory(Accessory accessory) {
        accessories.put(accessories.size() + 1, accessory);
        cost += accessory.getCost();
    }

    public double getCost() {
        return cost;
    }

    public HashMap<Integer, Flower> getFlowers() {
        return flowers;
    }

    public void showFlowers() {
        for (Integer key : flowers.keySet()) {
            System.out.println("Index : " + key);
            System.out.println("Flower : " + flowers.get(key));
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
