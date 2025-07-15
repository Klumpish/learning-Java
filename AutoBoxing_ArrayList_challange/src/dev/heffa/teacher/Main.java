package dev.heffa.teacher;


import java.util.ArrayList;

record Customer2(String name, ArrayList<Double> transactions) {


    public Customer2(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}

public class Main {
    public static void main(String[] args) {

        Customer2 bob = new Customer2("Bob S", 1000.0);
        System.out.println(bob);

        Bank2 bank2 = new Bank2("Chase");
        bank2.addNewCustomer("Jane A", 500.0);
        System.out.println(bank2);

        bank2.addTransaction("Jane A", -10.25);
        bank2.addTransaction("Jane A", -75.01);
        bank2.printStatement("Jane A");
        bank2.addNewCustomer("Heffa L", 30);
        bank2.addTransaction("Heffa L", 300.0);
        bank2.printStatement("heffa L");
    }
}

class Bank2 {
    private String name;
    private ArrayList<Customer2> customers = new ArrayList<>(5000);

    public Bank2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank2{" + "name='" + name + '\'' + ", customers=" + customers +
          '}';
    }

    private Customer2 getCustomer(String customerName) {

        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer2 customer = new Customer2(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer2 customer2 = getCustomer(name);
        if (customer2 != null) {
            customer2.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        Customer2 customer2 = getCustomer(customerName);
        if (customer2 == null) {
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer2.name());
        System.out.println("Transactions:");
        for (double d : customer2.transactions()) { //unboxing
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }


    }
}