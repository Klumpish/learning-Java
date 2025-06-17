public class BankAccount {
    private int accNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    //constructor
    public BankAccount() {
        System.out.println("Empty constructor called");
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double balance) {
        if (balance < 0) {
            System.out.println("the Deposit is negative" + balance);
        } else {

            this.balance += balance;
            System.out.println("new balance is " + this.balance);
        }
    }

    public void withdraw(double balance) {
        if (balance < 0) {
            System.out.println("the Withdraw is negative");
        } else {
            if (balance > this.balance) {
                System.out.println(
                  "the Withdraw is greater than the Balance: " + this.balance);

            } else {
                this.balance -= balance;
                System.out.println("you withdrew " + balance);
            }
        }
    }
}
