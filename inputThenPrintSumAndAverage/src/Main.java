import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int countInputs = 0;
        int sum = 0;


        while (true) {
            try {

                int input = scanner.nextInt();
                sum += input;
                countInputs++;
            } catch (Exception e) {
                break;
            }

        }
        if (countInputs == 0) {
            System.out.println("SUM = " + sum + " AVG = " + 0);
        } else {

            long avg = Math.round((double) sum / countInputs);
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }
    }
}
