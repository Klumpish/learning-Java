public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-707));
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;

        }

        return original == reverse;
    }
}
/*
First loop:
lastDigit = 7
reversed = 0 * 10 + 7 = 7
number = 70

Second loop:
lastDigit = 0
reversed = 7 * 10 + 0 = 70
number = 7

Third loop:
lastDigit = 7
reversed = 70 * 10 + 7 = 707
number = 0
 */