package shop.enity;

import java.util.Date;

public class Order {
    private static int autoID = 1;
    private int id;
    private Date orderTime;
    private String status;
    private double total;

    public Order() {
        this.id = autoID++;
    }

    public int getId() {
        return id;
    }
    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
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

    public void showInfo() {
    }
}
