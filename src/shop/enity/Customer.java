package shop.enity;

import account.entity.User;

import java.util.ArrayList;

public class Customer extends User {
    private double balance;
    private ArrayList<Order> orders;

    public Customer() {
        super();
    }

    @Override
    public void inputInfo() {
        super.inputInfo();


    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}
