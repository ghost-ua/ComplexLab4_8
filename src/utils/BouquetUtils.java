package utils;

import accessories.*;

import bouquets.Bouquet;
import flowers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BouquetUtils {
    protected static List<String> flowerTypes;

    public static Flower createFlower(String type, Freshness freshness, int stalk) {
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

        if (flowerTypes.contains(type)) {
            for (int i = 0; i < count; i++) {
                bouquet.addFlower(createFlower(type, Freshness.MidFresh, 10));
            }
        } else {
            System.out.println("Такої квітки немає. Оберіть іншу: ");
            type = scanner.nextLine();
        }

    }

    public static Accessory createAccessory(String type, Color color) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            switch (type) {
                case "strip" -> {
                    return new Strip(color);
                }
                case "foil" -> {
                    return new Foil(color);
                }
                case "bow" -> {
                    return new Bow(color);
                }
                default -> {
                    System.out.println("Такого аксесуару немає. Оберіть інший: ");
                    type = scanner.nextLine();
                }
            }
        }
    }

    public static void addAccessoryToBouquet(Bouquet bouquet, String type, String colorname) {
        Color color = Color.getColorByName(colorname);
        bouquet.addAccessory(createAccessory(type, color));
    }

}