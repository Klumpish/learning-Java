public class Main {
    public static void main(String[] args) {

        System.out.println(sumDigits(100) + " this should be 1");
        System.out.println(sumDigits(-100) + " this should be -1");
        System.out.println(sumDigits(4) + " this should be 4");
        System.out.println(sumDigits(3421) + " this should be 10");
    }

    public static int sumDigits(int number) {
        int lastDigit = 0;
        int sum = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                sum += lastDigit;
                number /= 10;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
