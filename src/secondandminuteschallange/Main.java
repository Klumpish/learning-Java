package secondandminuteschallange;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45)); //the second
        System.out.println(getDurationString(65, 145)); //the second
        System.out.println(getDurationString(65, 45)); //the second
        System.out.println(getDurationString(3945)); //the second
        System.out.println(printYearsAndDays(525600L));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
         return "the input in seconds can not be negative " + seconds;
        }

        int minutes = seconds / 60;
        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0){
            return "the input in minutes can not be negative " + minutes;
        }
        if (seconds < 0 || seconds > 59) {
            return "the input in seconds must be between 0 and 59, " + seconds;
        }
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";

    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long day = minutes / (60 * 24); // 1 day  = 1440 minutes
        long year = day / 365;
        long remaningDays = day % 365;
        System.out.println(minutes + " min = " + year + " y and "+remaningDays+" d");
    }
}
