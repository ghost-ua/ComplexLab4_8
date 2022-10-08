package menu;

import bouquets.Bouquet;
import menu.bouquetmenu.BouquetMenu;
import order.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class AddBouquetMenuCommand implements Command {
    private final Order order;

    public AddBouquetMenuCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute(List<String> params) {
        Bouquet obj = new Bouquet();

        BouquetMenu menu = new BouquetMenu(obj);
        Scanner scanner = new Scanner(System.in);

        System.out.println(" _Create your bouquet_ ");
        while (true) {
            System.out.println(" Input your command: ");
            List<String> command = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));

            if (!command.get(0).equals("back")) {
                menu.execute(command);
            } else {
                break;
            }
        }
        order.addBouquet(obj);
    }
}
