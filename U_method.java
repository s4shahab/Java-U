public class U_method {
    public static void calculateScore(boolean ngover,int nscore,int nlevelcomp,int newbonus){

        int newfinalscore=nscore;

        if (ngover){
            newfinalscore+=nlevelcomp*newbonus;
            System.out.println("Your new final score is "+newfinalscore);
        }
    }
    public static void main(String[] args) {
        calculateScore(true,10000,8,200);

    }
}
