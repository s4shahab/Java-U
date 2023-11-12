public class forStatement {
    public static void main(String[] args) {
//        for (int i=0;i<=10;i++){
//            System.out.println(i);
//        }

        for (double interestrate=7.5;interestrate<=10;interestrate+=0.25){
            double interestAmounts=calculateInterest(100,interestrate);
            if (interestAmounts==9){
                break;
            }
            System.out.println("100 at "+interestrate +" % interest = "+interestAmounts);
        }

        System.out.println( " New Prog");

        for (double rate=2.0;rate<=5.0;rate ++){
            double interestAmount= calculateInterest(10000,rate);
            System.out.println("10,000 at " +rate +"% interest = "+ interestAmount);

        }

        System.out.println("10,000 at 2% interest = "+calculateInterest(10000,2));
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }


}
