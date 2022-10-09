package menu.bouquetmenu;

import bouquets.Bouquet;
import menu.Command;

import java.util.List;

public class ShowFlowersCommand implements Command {
    private final Bouquet bouquet;

    public ShowFlowersCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }
    @Override
    public String getKey(){
        return "show_flowers";
    }
    @Override
    public void execute(List<String> params) {
        System.out.println("Flowers in your bouquet");
        bouquet.showFlowers();
    }
}