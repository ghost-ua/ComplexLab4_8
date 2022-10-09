package menu;

import order.Order;

import java.util.List;

public class CancelOrderCommand implements Command {
    private Order order;

    public CancelOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public String getKey(){
        return "cancel_order";
    }
    @Override
    public void execute(List<String> params) {
        order = new Order();
        System.out.println("Your order was canceled");
    }
}
