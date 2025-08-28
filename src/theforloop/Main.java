package theforloop;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        for(int counter = 1; counter <= 2; counter++){
            System.out.println("counter = " + counter);
        }


        for (double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateIntrest(10000.0,rate);
            System.out.println("10,000 at "+ rate + "% intrest = " + interestAmount);
        }

        for (double rate = 7.5; rate <= 10; rate += 0.25){
            double interestAmount = calculateIntrest(100.0,rate);
            if (interestAmount > 8.5){
                break;
            }
            System.out.println("100 at "+ rate + "% intrest = $" + interestAmount);
        }
    }
    public static double calculateIntrest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
