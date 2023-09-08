public class MethodOverloadingChallenge {
// 1inch= 2.54 cnetimeter
    public static double convertToCentimeters(int heightInch){
        double heightCM=heightInch*2.54f;
        return heightCM;
        
    }

    public static double convertToCentimeters(int heightFeet,int heightInches){
        int TotalheightInches=heightFeet*12+heightInches;
        double value =convertToCentimeters(TotalheightInches);
        return value;


    }
    public static void main(String[] args) {

        double x=convertToCentimeters(5,8);
        System.out.println("5 foot, 8 inch = " +x +" cm");
        double y=convertToCentimeters(12);
        System.out.println("12 inch ="+ y+ " cm");

    }
}
