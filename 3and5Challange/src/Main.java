public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                System.out.println(i + " can be divided by both 3 and 5");
                count++;
            }
            if (count == 5) {
                System.out.println(
                        sum + " is the sum of all 5 numbers that can be divided by both 3 and 5");
                break;
            }
        }
    }
}
