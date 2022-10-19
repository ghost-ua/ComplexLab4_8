package order;

import bouquets.Bouquet;
import java.util.HashMap;


public class Order {

    private double cost;
    protected HashMap<Integer, Bouquet> bouquets;
    private String cardNumber;

    public Order() {
        bouquets = new HashMap<>();
    }

    public void addBouquet(Bouquet bouquet) {
        bouquets.put(bouquets.size() + 1, bouquet);
        this.cost += bouquet.getCost();
    }

    public void delBouquet(int index) {
        bouquets.remove(index);
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setBouquets(HashMap<Integer, Bouquet> bouquets) {
        this.bouquets = bouquets;
    }


    public double getCost() {
        return cost;
    }

    public HashMap<Integer, Bouquet> getBouquets() {
        return bouquets;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
