package menu.bouquetmenu;

import bouquets.Bouquet;
import menu.Command;
import utils.BouquetUtils;

import java.util.List;

public class AddAccessoriesToBouquetCommand implements Command {
    private final Bouquet bouquet;

    public AddAccessoriesToBouquetCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute(List<String> params) {
        if (params.size() == 2) {
            BouquetUtils.addAccessoryToBouquet(bouquet, params.get(0), params.get(1));
            System.out.println("Accessory added to bouquet");
        } else {
            System.out.println("Wrong parameters added");
        }

    }
}
