package utils;

import accessories.*;

import bouquets.Bouquet;
import flowers.*;
import menu.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BouquetUtils {
    protected static List<String> flowerTypes;

    public static Flower createFlower(String type, Freshness freshness, int stalk) {
        Scanner scanner = new Scanner(System.in);
        switch (type) {
            case "whiterose" -> {
                return new WhiteRose(freshness, stalk);
            }
            case "redrose" -> {
                return new RedRose(freshness, stalk);
            }
            case "blacktulip" -> {
                return new BlackTulip(freshness, stalk);
            }
            case "yellowtulip" -> {
                return new YellowTulip(freshness, stalk);
            }
            default -> {
                System.out.println("Fatal Error");
                System.exit(0);
                return new Rose(freshness, stalk);
            }
        }
    }

    public static void addFlowersToBouquet(Bouquet bouquet, String type, int count) {
        Scanner scanner = new Scanner(System.in);

        flowerTypes = new ArrayList<>();
        flowerTypes.add("whiterose");
        flowerTypes.add("redrose");
        flowerTypes.add("blacktulip");
        flowerTypes.add("yellowtulip");

        if(flowerTypes.contains(type)) {
            for (int i = 0; i < count; i++) {
                bouquet.addFlower(createFlower(type, Freshness.MidFresh, 10));
            }
        } else{
            System.out.println("Такої квітки немає. Оберіть іншу: ");
            type = scanner.nextLine();
        }

    }

    public static Accessory createAccessory(String type, Color color) {
        return switch (type) {
            case "strip" -> new Strip(color);
            case "foil" -> new Bow(color);
            case "bow" -> new Foil(color);
            default -> new Strip(color);
        };
    }

}