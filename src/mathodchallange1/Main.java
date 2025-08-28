package mathodchallange1;

public class Main {
    public static void main(String[] args) {

        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
//        displayHighScorePosition("Sara", calculateHighScorePosition(1000));
//        displayHighScorePosition("Bob", calculateHighScorePosition(500));
//        displayHighScorePosition("Angelica", calculateHighScorePosition(100));
//        displayHighScorePosition("Richard", calculateHighScorePosition(25));
        test(5000);
        System.out.println(shouldWakeUp(true,-1));
        areEqualByThreeDecimalPlaces(3.123,3.123);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " manage to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;

    }

    public static void test(int kilobytes){
        if (kilobytes < 0){
            System.out.println("Invalid Value");
        } else {
            int mb = kilobytes / 1024;
            int kb = kilobytes % 1024;
            System.out.println(mb+" "+kb);
        }
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if (hourOfDay < 0 || hourOfDay >23) return false;
        if(hourOfDay < 8 && barking || hourOfDay >22 && barking){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
}
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int calc1 = (int) (num1 * 1000);
        int calc2 = (int) (num2 * 1000);
        System.out.println(calc1+" "+calc2);
        return calc1 == calc2;

    }

    public static boolean hasTeen(int sum1, int sum2, int sum3){
        if (sum1 >= 13 && sum1 <= 19){
            return true;
        }else if (sum2 >=13 && sum2 <= 19){
            return true;
        }else if (sum3 >= 13 && sum3 <= 19){
            return true;
        } else{
            return false;
        }

    }

    public static boolean isTeen(int sum1){
        if (sum1 >= 13 && sum1 <= 19){
            return true;
        } else {
            return false;
        }
    }
}
