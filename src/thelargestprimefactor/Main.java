package thelargestprimefactor;

public class Main {
    public static void main(String[] args) {


//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(1));
//        System.out.println(getLargestPrime(7));
//        System.out.println(getLargestPrime(21));
        System.out.println(printStuff(5));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int largest = 0;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                largest = i;
                number = number / i;
            }
        }

        return largest;
    }

    public static String printStuff(int number) {
        if (number <= 0) return "Invalid Number - Pick a number above 1.";

        for (int i = 1; i <= number; i++) {
            System.out.println("Counting: " + i);

        }
        return "";
    }
}
