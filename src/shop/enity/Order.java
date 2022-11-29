package shop.enity;

import java.time.LocalDateTime;

public class Order {
    private static int autoID = 1;
    private int id;
    private LocalDateTime orderTime;
    private String status;
    private double total;

    public Order() {
        this.id = autoID++;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
