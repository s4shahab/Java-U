public class WhileLoopChallenge {
    public static void main(String[] args) {

        int num=5;
        int EvenCount=0;
        int OddCount=0;

        while (num<=20){

            if (isEvenNumber(num)){
                System.out.println("The even number is "+ num);
                EvenCount+=1;

                if (EvenCount==5){
                    break;
                }
            }

            else {
                OddCount+=1;
            }


            num++;
        }

        System.out.println("The total even numbers are : "+EvenCount);
        System.out.println("The total odd numbers are " +OddCount);

    }

    int EvenCount=0;
    int OddCount=0;
    public static boolean isEvenNumber(int number){

        if ((number%2)==0){

            return true;
        }

        else {
            return false;
        }



    }
}
