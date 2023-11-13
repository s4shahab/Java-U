public class Sum3and5Challenge {
    public static void main(String[] args) {

        double sum=0;
        int count=0;

        for (int i=1;i<=1000;i++){


            if ((i%3==0) && (i%5==0)){

                sum+=i;
                count+=1;

                System.out.println("The number divisible by both 3 and 5 is " + i);

            }
            if (count==5){
                break;
            }
        }
        System.out.println("The sum of numbers is "+ sum);
    }
}
