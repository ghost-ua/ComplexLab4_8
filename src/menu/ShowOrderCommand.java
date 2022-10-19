package menu;

import order.Order;
import utils.OrderUtils;

import java.util.List;

public class ShowOrderCommand implements Command {
    private final Order order;

    public ShowOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public String getKey() {
        return "show_order";
    }

    @Override
    public void execute(List<String> params) {

        System.out.println("This is your order");
        OrderUtils.showOrder(order);
    }


}
