package dev.heffa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public Boolean addCustomer(String customerName, Double initialTransaction) {
        for (int i = 0; i < this.customers.size(); i++) {
            var customer = this.customers.get(i).getName();
            if (customer.equalsIgnoreCase(customerName)) {
                return false;
            }
        }

        Customer newCustomer = new Customer(customerName, initialTransaction);
        this.customers.add(newCustomer);
        return true;
    }

    public boolean addCustomerTransaction(String customerName, Double amount) {
        for (int i = 0; i < this.customers.size(); i++) {
            var customer = this.customers.get(i).getName();
            if (customer.equalsIgnoreCase(customerName)) {
                this.customers.get(i).addTransaction(amount);
                return true;
            }
        }
        return false;
    }

    public void printCustomerStatement(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            var customer = this.customers.get(i).getName();
            if (customer.equalsIgnoreCase(customerName)) {
                System.out.println("name: " + customerName);
                for (Double amount : this.customers.get(i).getTransactions()) {
                    System.out.println("amount: " + amount);
                }
                return;
            }
        }

        System.out.println("Customer not found with name : " + customerName);

    }
}
