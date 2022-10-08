import menu.MainMenu;
import order.Order;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        MainMenu mainMenu = new MainMenu(orders);

        while (true) {
            System.out.println("  __ Main Menu __");
            System.out.println("Input your command: ");
            List<String> command = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
            mainMenu.execute(command);
        }
    }
}
