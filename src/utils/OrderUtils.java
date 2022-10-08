package utils;

import bouquets.Bouquet;
import order.Order;


import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class OrderUtils {
    public static void showOrder(Order order) {
        System.out.println("Total Cost: " + order.getCost());
        System.out.println("Bouquets: ");
        HashMap<Integer, Bouquet> bouquets = order.getBouquets();
        for (int i = 1; i <= bouquets.size(); i++) {
            System.out.println("Bouquet: " + bouquets.get(i).getName());
            System.out.println("Cost: " + bouquets.get(i).getCost());
        }
    }
    public static void saveCheck(Order order) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("check.txt");
            fw.write("Card Number: " + order.getCardNumber());
            fw.write("\nBouquets: ");
            for (int i = 1; i <= order.getBouquets().size(); i++) {
                fw.write("Bouquet: " + order.getBouquets().get(i).getName());
                fw.write("Cost: " + order.getBouquets().get(i).getCost());
            }
            fw.write("\nTotal Cost: " + order.getCost());
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void payOrder(Order order){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер картки: ");
        order.setCardNumber(scanner.nextLine());
    }
}
