package order;

import bouquets.Bouquet;
import menu.Command;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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


    public void makePayment(String cardNum) {
        cardNumber = cardNum;
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
