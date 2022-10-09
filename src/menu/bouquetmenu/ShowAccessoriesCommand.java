package menu.bouquetmenu;

import bouquets.Bouquet;
import menu.Command;

import java.util.List;

public class ShowAccessoriesCommand implements Command {
    private final Bouquet bouquet;

    public ShowAccessoriesCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }
    @Override
    public String getKey(){
        return "show_accessories";
    }
    @Override
    public void execute(List<String> params) {
        System.out.println("Accessories in your bouquet");
        bouquet.showAccessories();
    }
}
