package order;

import bouquets.Bouquet;
import menu.Command;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;


public class Order {
    private static ByteArrayOutputStream baos;
    private double cost;
    protected HashMap<Integer, Bouquet> bouquets;
    private String cardNumber;

    public Order() {
        bouquets = new HashMap<>();
    }

    public void addBouquet(Bouquet bouquet) {
        bouquets.put(bouquets.size() + 1, bouquet);
    }

    public void delBouquet(int index) {
        bouquets.remove(index);
    }


    public void makePayment(String cardNum) {
        cardNumber = cardNum;
    }


    public void saveCheck() {
        PrintStream ps = new PrintStream(baos);
        PrintStream originalStdOut = System.out;

        System.setOut(ps);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Bouquets: " + bouquets);
        System.out.println("Cost: " + cost);
        System.out.flush();
        System.setOut(originalStdOut);
    }


}
