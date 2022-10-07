package menu.bouquetmenu;

import bouquets.Bouquet;
import menu.Command;

import java.util.List;

public class DelFlowerCommand implements Command {
    private final Bouquet bouquet;

    public DelFlowerCommand(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public void execute(List<String> params) {
        System.out.println("Flower deleted from bouquet");
    }
}
