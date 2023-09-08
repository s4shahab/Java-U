public class AreEqualByThreeDecimalPlaces {

//    here we take two double type number as input and then multiply it by 1000 for easy comparsion and type cast it in integer then compare

    public static boolean areEqualByThreeDecimalPlaces(double a,double b){
        a=(int)(a*1000);
        b=(int)(b*1000);

        if (a==b){
            return true;
        }

        else{
            return false;
        }
    }
    public static void main(String[] args) {

    }
}
