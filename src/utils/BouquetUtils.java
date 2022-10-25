package utils;

import accessories.*;

import bouquets.Bouquet;
import flowers.*;

import java.util.*;

/*

1. Always try to avoid utility classes, because THEY GROW VERY FAST and eventually BECOME A GARBAGE CAN WITH A LOT OF EVERYTHING in there.

- createFlower: create Factory method for flowers (read Factory pattern)
public static class FlowerFactory {

    // Ideally, there must be only one parameter which indicates for type of flower
    // But if you need to pass more that 3 parameters it will be better to create another class: FlowerParameters and put that inside it.
    ==========================================================================================
    public class FlowerParameters {
        public Date date;
        public int stalk;
    }

    public static Flower createFlower(String type, FlowerParameters additionalParameters) {
        switch(type) {
            case "whiterose" -> {
                return new WhiteRose(additionalParameters.date, additionalParameters.stalk);
            }
            ...
        }
    }
    ==========================================================================================
    public static Flower createFlower(String type, Date date, int stalk) {
        switch (type) {
            case "whiterose" -> {
                return new WhiteRose(date, stalk);
            }
            case "redrose" -> {
                return new RedRose(date, stalk);
            }
            case "blacktulip" -> {
                return new BlackTulip(date, stalk);
            }
            case "yellowtulip" -> {
                return new YellowTulip(date, stalk);
            }
            default -> {
                System.out.println("Fatal Error");
            }
        }
    }

}

*/

// 2. Instead of using utility class for creating bouquets, create a concrete class for that

// I think it will be better to create additional class: BouquetManager that will be doing that job

public static class BouquetManager {
    private Array flowerTypes = { "whiterose", "redrose", "blacktulip", "yellowtulip" };

    public static Bouquet createBouquet(String type, int count) {
        Scanner scanner = new Scanner(System.in);
        Bouquet bouquet = new Bouquet(type + " " + count);

        if (flowerTypes.contains(type)) {
            for (int i = 0; i < count; i++) {
                Flower flower = FlowerFactory.create(type, Freshness.MidFresh, 10);
                bouquet.addFlower(flower);
            }
        }

        return null;

        // Try to avoid loops when possible. Avoid inner loops and infinite loops.
        // In that case, put infinit loop in other place and BouquetManager inside that.

        /*
            AddFlowersToBouquetCommand
            while(true) {
                String type = params.get(0);
                int count = Integer.parseInt(params.get(1);

                Bouquet b = BouquetManager.createBouquet(type, count);
                
                if(b == null) {
                    System.out.println("Такої квітки немає. Оберіть іншу: ");
                    type = scanner.nextLine();
                }
            }

        */
    }
}

public class BouquetUtils {
    protected static List<String> flowerTypes;

    // Replace by factory above
    public static Flower create(String type, Freshness freshness, int stalk) {
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

    
    // The same principle as with creating bouquet.
    // Create AccessoryManager class
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

    
    /*
        In AddAccessoryToBouquetCommand.java -> execute
        
        public void execute(List<String> params) {
            if (params.size() == 2) {
                String type = params.get(0);
                Color color = Color.getColorByName(params.get(1));

                Accessory accessory = AccessoryManager.create(type,color);
                bouquet.addAccessory(accessory);
                System.out.println("Accessory added to bouquet");
            } else {
                System.out.println("Wrong parameters added");
            }
        }

    */
    // Remove that method. 
    public static void addAccessoryToBouquet(Bouquet bouquet, String type, String colorname) {
        Color color = Color.getColorByName(colorname);
        bouquet.addAccessory(createAccessory(type, color));
    }

    // move that method to Boutique class and sort flowers through boutique instance: boutique.sortFlowers()
    // replace sorting by date
    public static void sortFlowersByFresh(Bouquet bouquet){
        Collections.sort(bouquet.getFlowers(), new Comparator<Flower>(){
            @Override
            public int compare(Flower fl1, Flower fl2){
                return fl1.getFresh().compareTo(fl2.getFresh());
            }
        });
    }

    // rename - printFlowersByStalkLength
    // move that method in Bouquet class
    /*
        In FindStalkLengthCommand.java -> execute insdead of 
            [BouquetUtils.findFlowerByStalkLength(bouquet, Integer.parseInt(params.get(0)), Integer.parseInt(params.get(1)));]
        just write:
            bouquet.findFlowerByStalkLength(params.get(0)), Integer.parseInt(params.get(1)));

    */
    public static void findFlowerByStalkLength(Bouquet bouquet, int from, int to){
        List<Flower> flowers = bouquet.getFlowers();
        for (int i=0; i<flowers.size(); i++) {
            if(flowers.get(i).getStalkLength()>from && flowers.get(i).getStalkLength()<to){
            System.out.println("Index : " + (i+1));
            System.out.println("Flower : " + flowers.get(i));
            }
        }
    }
}