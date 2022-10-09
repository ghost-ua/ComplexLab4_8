package menu.bouquetmenu;

import menu.Command;

import java.util.List;

public class BackCommand implements Command {
    @Override
    public String getKey(){
        return "back";
    }
    @Override
    public void execute(List<String> params) {
        System.out.println("Bouquets was saved");
        System.exit(0);
    }
}
