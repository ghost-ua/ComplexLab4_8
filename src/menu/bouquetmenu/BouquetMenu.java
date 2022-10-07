package menu.bouquetmenu;

import bouquets.Bouquet;
import menu.MainMenu;

import java.util.ArrayList;
import java.util.HashMap;



public class BouquetMenu extends MainMenu {

    public BouquetMenu(Bouquet bouquet) {
        menuItems = new HashMap<>();
        menuItems.put("add_flowers", new AddFlowersToBouquetCommand(bouquet));
        menuItems.put("add_accessories", new AddAccessoriesToBouquetCommand(bouquet));
        menuItems.put("del_flower", new DelFlowerCommand(bouquet));
        menuItems.put("del_accessory", new DelAccessoryCommand(bouquet));
        menuItems.put("show_flowers", new ShowFlowersCommand(bouquet));
        menuItems.put("show_accessories", new ShowAccessoriesCommand(bouquet));
        menuItems.put("back", new BackCommand());

        help = new ArrayList<>();
        help.add("add_flowers 'type' 'count'");
        help.add("add_accessories 'type'");
        help.add("del_flower 'index'");
        help.add("del_accessory 'index'");
        help.add("show_flowers");
        help.add("show_accessories");
        help.add("back");
    }
}
