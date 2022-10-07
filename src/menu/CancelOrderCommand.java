package menu;

import order.Order;

import java.util.List;

public class CancelOrderCommand implements Command {
    private final Order order;

    public CancelOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute(List<String> params) {
        System.out.println("Your order was canceled");
    }
}
