package switchchallange;

public class Main {
    public static void main(String[] args) {

        char natoAlphabet = 'a';
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);


        switch(natoAlphabet){
            case 'A', 'a':
                System.out.println(natoAlphabet+" = Able");
                break;
            case 'B':
                System.out.println(natoAlphabet+" = Baker");
                break;
            case 'C':
                System.out.println(natoAlphabet+" = Charlie");
                break;
            case 'D':
                System.out.println(natoAlphabet+" = Dog");
                break;
            case 'E':
                System.out.println(natoAlphabet+" = Easy");
                break;
            default:
                System.out.println(natoAlphabet+" Not found");
        }

    };

    public static void printDayOfWeek(int day){
        String dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> day + " is not one of the 0-6 days of the week";


//        return switch(day){
//            case 0 -> "Sunday";
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 ->  "Friday";
//            case 6 ->  "Saturday";
//            default ->  day + " is not one of the 0-6 days of the week";

        };
        System.out.println(dayOfWeek);
    }
}
//public class NumberOfDaysInMonth {
//
//    public static boolean isLeapYear(int year){
//        if (year >= 1 && year <= 9999) {
//            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static int getDaysInMonth(int month, int year){
//        if((month < 1 || month > 12) || (year < 1 || year > 9999)){
//            return -1;
//        }
//        switch(month){
//            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                return 31;
//            case 4: case 6: case 9: case 11:
//                return 30;
//            case 2:
//                return isLeapYear(year) ? 29 : 28;
//            default:
//                return -1; // This should never be reached due to earlier check
//        }
//    }
//}


