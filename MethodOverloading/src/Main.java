public class Main {
    public static void main(String[] args){
        int newScore = calcuateScore("Tim",500);
        System.out.println("New score is " + newScore);
        calcuateScore(75);
        calcuateScore();
    }
    public static int calcuateScore(String playerName, int score){

        System.out.println("Player " + playerName +" scored "+ score + " points");
        return score * 1000;
    }
    public static int calcuateScore(int score){

        System.out.println("unnamed Player scored "+ score + " points");
        return score * 1000;
    }
    public static int calcuateScore(){

        System.out.println("No Player name");
        return 0;
    }
}
