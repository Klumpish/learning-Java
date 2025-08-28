package flourpacker;

public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4) + " FALSE");
        System.out.println(canPack(1, 0, 5) + " TRUE");
        System.out.println(canPack(0, 5, 4) + " TRUE");
        System.out.println(canPack(2, 2, 11) + " TRUE");
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        /*
            int a = 3;
            int b = 5;
            int result = Math.min(a, b); // result is 3
         */
        int maxBigBagsWeCanUse = Math.min(goal / 5, bigCount);
        int remainingAfterBigs = goal - (maxBigBagsWeCanUse * 5);

        return smallCount >= remainingAfterBigs;
    }
}
