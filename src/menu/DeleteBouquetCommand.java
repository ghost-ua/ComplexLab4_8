package menu;

import order.Order;

import java.util.List;

public class DeleteBouquetCommand implements Command {
    private final Order order;

    public DeleteBouquetCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute(List<String> params) {
        order.delBouquet(Integer.parseInt(params.get(0)));
        System.out.println("Bouquet Deleted From Order");
    }
}
