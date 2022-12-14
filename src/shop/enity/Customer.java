package shop.enity;

import account.entity.User;


import java.util.List;
import java.util.Scanner;

public class Customer extends User {
    private double balance;
    private List<Order> orders;

    public Customer() {

    }

    public Customer(String username, String name, String email, String address, String phone, String password, String role, double balance) {
        super(username, name, email, address, phone, password, role);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "balance=" + balance +
                '}';
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void showInfo() {
    }
}
