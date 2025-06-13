public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(73));
        System.out.println(convertToCentimeters(6,1));
    }
    public static double convertToCentimeters(int heightInInches){

        return Math.round((heightInInches * 2.5400));
    }
    public static double convertToCentimeters(int feet, int inches){
//        feet = feet * 12;
//        int totalInches = feet + inches;
        return (int) convertToCentimeters((feet*12) + inches);
    }
}
