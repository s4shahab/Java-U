import java.util.Scanner;
public class Method_Challenge {
    public static void displayHighScorePosition(String players_name, int players_position){
        System.out.println( players_name +" managed to get in to position "+ players_position +" on the high score list");

    }

    public static int calculateHighScorePosition(double player_score){
        if (player_score>=1000){
            return 1;
        } else if (player_score>=500 && player_score<1000) {
            return 2;
            
        } else if (player_score>=100 && player_score<500) {
            return 3;
            
        }
        else {
            return 4;
        }

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Player Name :");
        String player_name=sc.next();


        System.out.println("Enter Player Score between 1 & 1500 :");
        double player_score=sc.nextDouble();



        int highScorePosition=calculateHighScorePosition(player_score);
        displayHighScorePosition(player_name,highScorePosition);

    }


}
