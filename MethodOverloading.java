public class MethodOverloading {
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score +" points");
        return score*1000;

    }



    public static int calculateScore(int score){
//        System.out.println("Unnamed Player scored "+score +" points");
//        return score*1000;

        return calculateScore("Shahab",100);
    }

    public static int calculateScore(){
        System.out.println("No player, No score");
        return 0;

    }
    public static void main(String[] args) {
        int newScore=calculateScore("Tim",12);
        System.out.println("player new score is "+newScore);

        calculateScore(75);
        calculateScore();

        System.out.println("new score 1 is "+calculateScore("Tim",500));
        System.out.println("new score 2 is "+calculateScore(30));

    }
}
