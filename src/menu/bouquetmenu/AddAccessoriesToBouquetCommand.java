package menu.bouquetmenu;

import bouquets.Bouquet;
import menu.Command;

import java.util.List;

public class AddAccessoriesToBouquetCommand implements Command {
    private final Bouquet bouquet;

    public AddAccessoriesToBouquetCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute(List<String> params) {
        System.out.println("Accessory added to bouquet");
    }
}
