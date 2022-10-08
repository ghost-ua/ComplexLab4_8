package menu;

import order.Order;
import utils.OrderUtils;

import java.util.List;

public class PayOrderCommand implements Command {
    private final Order order;

    public PayOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute(List<String> params) {
        OrderUtils.payOrder(order);
        OrderUtils.saveCheck(order);
        System.out.println("Thanks for purchase!");
    }
}
