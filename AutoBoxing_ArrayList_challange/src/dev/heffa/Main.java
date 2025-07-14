package dev.heffa;

public class Main {
    public static void main(String[] args) {


        Bank bank = new Bank("Super bank");
        var customer1 = bank.addCustomer("billy", 400.0);
        var customer2 = bank.addCustomer("jill", -200.0);
        var customer3 = bank.addCustomer("tim", 806.0);

        bank.addCustomerTransaction("billy", 40.0);
        bank.printCustomerStatement("billy");

        boolean addedAgain = bank.addCustomer("billy", 1000.0);
        System.out.println(
          "Adding duplicate Billy: " + addedAgain); // should be false

        boolean success = bank.addCustomerTransaction("notarealperson", 500.0);
        System.out.println(
          "Transaction success: " + success); // should be false

        bank.printCustomerStatement("ghost");
        bank.printCustomerStatement("jill");
        bank.printCustomerStatement("tim");


    }
}
