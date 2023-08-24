public class U_02 {
    public static void main(String[] args) {
//        If then else challenge
        boolean gameover=true;
        int score=800;
        int levelcompleted=5;
        int bonus=100;

        int finalscore=score;

        if (gameover==true){
            finalscore+=levelcompleted*bonus;
            System.out.println("Your final score is "+finalscore);
        }

//        set score to 10000
//        set level completed to 8
//        set bonous to 200

        boolean newgameover=true;
        int nescore=10000;
        int nelevelcomp=8;
        int newbonus=200;

        int newfinalscore=nescore;

        if (newgameover){
            newfinalscore+=nelevelcomp*newbonus;
            System.out.println("Your new final score is "+newfinalscore);
        }
    }
}
