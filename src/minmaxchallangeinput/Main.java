package minmaxchallangeinput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isCorrect = true;
        int count = 1;
        double min = 100;
        double max = 0;
        Scanner scanner = new Scanner(System.in);
        while (isCorrect) {
            System.out.println("Input a number #" + count + ": ");
            String input = scanner.nextLine();
            try {
                double number = Double.parseDouble(input);
                min = Math.min(min, number);
                max = Math.max(max, number);
                count++;
                if (count >= 6) {
                    isCorrect = false;
                }

            } catch (Exception e) {
                System.out.println(
                  "Invalid input @" + count + ", the program will exit");
                System.out.println(
                  "this was the min / max inputs: " + min + "/" + max);
                isCorrect = false;
            }

        }
        System.out.println("this was the min // max inputs: " + min + "/" + max);
    }
}
