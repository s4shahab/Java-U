public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue=7;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 3:
                System.out.println("value was 3 ");
                break;

            case 6: case 7: case 8:
                System.out.println("value was 6 or 7 or 8");
                System.out.println("actually it was "+switchValue);
                break;

            default:
                System.out.println("value was neither 1 or 3");
                break;
        }

//        in if else equivalent
        int value=2;

        if (value==1){
            System.out.println("value was 1 ");
        } else if (value==3) {
            System.out.println("value was 3");

        }
        else {
            System.out.println("value was not 1 or 3");
        }

//        String example

        String month="September";
        System.out.println(month +" is in the "+ getQuarter(month)+ " quarter");


    }

    public static String getQuarter(String month){
        switch (month){
            case "January":
            case "February":
            case "March":
                return "1st";

            case "April":
            case "May":
            case "June":
                return "2nd";

            case "July":
            case "August":
            case "September":
                return "3rd";

            case "October":
            case "November":
            case "December":
                return "4th";

        }

        return "bad";
    }
}
