package theprimenumberchallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");


        challenge(100, 1000);
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void challenge(int start, int end) {
        int primeCounter = 0;
        if (start <= 1000 && end <= 1000) {
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    primeCounter++;
                    System.out.println(i + " is a prime number");
                    if (primeCounter == 3) {
                        break;
                    }
                }
            }
        }
    }

}
