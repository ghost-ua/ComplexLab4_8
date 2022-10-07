package menu;

import order.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainMenu {
    protected HashMap<String, Command> menuItems;
    protected List<String> help;

    public MainMenu() {
    }

    public MainMenu(List<Order> orders) {
        Order order = new Order();

        menuItems = new HashMap<>();
        menuItems.put("add_bouquet", new AddBouquetMenuCommand(order));
        menuItems.put("show_order", new ShowOrderCommand(order));
        menuItems.put("del_bouquet", new DeleteBouquetCommand(order));
        menuItems.put("pay_order", new PayOrderCommand(order));
        menuItems.put("cancel_order", new CancelOrderCommand(order));
        menuItems.put("exit", new ExitCommand());

        help = new ArrayList<>();
        help.add("add_bouquet");
        help.add("show_order");
        help.add("del_bouquet 'index'");
        help.add("pay_order");
        help.add("cancel_order");
        help.add("exit");

    }

    public void execute(List<String> commandWithParams) {

        String command = commandWithParams.get(0);
        commandWithParams.remove(0);
        if (menuItems.containsKey(command)) {
            menuItems.get(command).execute(commandWithParams);
        } else if (command.equals("help")) {
            System.out.println(help);
        } else {
            System.out.println("Incorect command! Try again or execute 'help' command ");
        }
    }

}

