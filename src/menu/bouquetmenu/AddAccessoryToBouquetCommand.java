package menu.bouquetmenu;

import bouquets.Bouquet;
import menu.Command;
import utils.BouquetUtils;

import java.util.List;

public class AddAccessoryToBouquetCommand implements Command {
    private final Bouquet bouquet;

    public AddAccessoryToBouquetCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String getKey(){
        return "add_accessory";
    }

    @Override
    public String getParams(){
        return " 'type' 'color'";
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
