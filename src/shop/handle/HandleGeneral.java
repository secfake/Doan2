package shop.handle;

import shop.enity.*;

import java.util.List;

public class HandleGeneral {
    public void showProducts(List<Product> products) {
        for (Product product : products) {
            product.showInfo();
        }
    }

    public void showOrder(List<Order> orders) {
        for (Order order : orders) {
            order.showInfo();
        }
    }

    public void showCustomer(Customer customer) {

    }

    public void eidtCustomer() {
    }
}
