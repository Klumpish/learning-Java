import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(readLine());
        readLine();
    }

    //    to parse things use Integer.parseInt(varName);
//                        Double.parseDouble(varName);
    public static double readLine() {
        Scanner scanner = new Scanner(System.in);

//        int sum = 0;
        double sum = 0;
        int count = 1;
        do {
            try {

                System.out.println("Enter number #" + count + ": ");
//                int number = scanner.nextInt();
                double number = scanner.nextDouble();
                count++;
                sum += number;

            } catch (InputMismatchException e) {
                System.out.println("Invalid number");

            } finally {
                scanner.nextLine(); // always clears the input line
            }


        } while (count < 6);
        System.out.println("The sum is " + sum);
        return sum;
    }
}
