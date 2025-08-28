package greatestcommondivisor;

public class Main {
    public static void main(String[] args) {
//        System.out.println(getGreatestCommonDivisor(12, 30));
//        System.out.println(isPerfectNumber(6));
        numberToWords(-222);
        System.out.println(reverseDigit(-222));
        System.out.println(getDigitCount(-222));


    }

    // write code here
    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }

        int min = Math.min(first, second);

        for (int i = min; i >= 1; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int perfect = 0;
        for (int i = 1; i <= number; i++) {
            if (perfect == number) {
                return true;
            }
            if (number % i == 0) {
                perfect += i;
                continue;
            }

        }
        return false;

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");

        }
        int count = getDigitCount(number);
        int reversed = reverseDigit(number);

        for (int i = 0; i < count; i++) {
            int wordCount = reversed % 10;
            switch (wordCount) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");

            }
            reversed /= 10;
        }

    }

    public static int reverseDigit(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        for (int i = number; i > 0; i /= 10) {
            count++;
        }
        return count;
    }
}
