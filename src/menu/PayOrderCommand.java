package menu;

import order.Order;

import java.util.List;

public class PayOrderCommand implements Command {
    private final Order order;

    public PayOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute(List<String> params) {
        System.out.println("Thanks for purchase!");
    }
}
