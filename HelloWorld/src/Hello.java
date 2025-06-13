public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Heffa");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien");
            System.out.println("And i am scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println(">>> You got the high score <<<");
        }


        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println(">>> You got the second top score and less than 100 <<<");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }


        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is True");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is Car");
        }

        String makeOfCar = "volvo";
        boolean isDomestic = makeOfCar != "volvo" ? false : true;
        if (isDomestic) {
            System.out.println("This is Domestic " + isDomestic);
        }

        double num1 = 20.00d;
        double num2 = 80.00d;
        double sum = (num1 + num2) * 100.00d;
        System.out.println(sum);
        double result = sum % 40.00d;
        System.out.println(result);
        boolean isZero = (result == 0) ? true : false;
        System.out.println(isZero);
        if (isZero) {
            System.out.println("This is Zero " + result + " boolean is " + isZero);
        }
        if (!isZero) {
            System.out.println("This is not Zero " + result + " is " + isZero);
        }


    }
}
