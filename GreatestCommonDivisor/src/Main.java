public class Main {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(isPerfectNumber(6));
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
}
