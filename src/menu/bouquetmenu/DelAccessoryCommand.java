package menu.bouquetmenu;

import bouquets.Bouquet;
import menu.Command;

import java.util.List;

public class DelAccessoryCommand implements Command {
    private final Bouquet bouquet;

    public DelAccessoryCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String getKey(){
        return "del_accessory";
    }
    @Override
    public String getParams(){
        return " 'index'";
    }
    @Override
    public void execute(List<String> params) {
        bouquet.getAccessories().remove(Integer.parseInt(params.get(0)));
        System.out.println("Flower deleted from bouquet");
    }
}

