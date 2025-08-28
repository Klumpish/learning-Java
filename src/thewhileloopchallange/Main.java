package thewhileloopchallange;

public class Main {
    public static void main(String[] args) {
        int start = 4;
        int evenCounter = 0;
        int oddCounter = 0;


        while (start <= 20) {
            start++;
            if (evenCounter == 5) {
                System.out.println(
                        "found " + evenCounter + " even numbers");
                System.out.println("found " + oddCounter + " odd numbers");
                break;
            }
            if (isEvenNumber(start)) {
                System.out.println(start);
                evenCounter++;
                continue;
            }
            oddCounter++;
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
