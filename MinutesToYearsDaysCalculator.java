public class MinutesToYearsDaysCalculator {



    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        }

        else {
            int totalyears=(int)(minutes/(60*24*365));
            int totalDays = (int) (minutes % (365 * 24 * 60)) / (24 * 60);
            System.out.println(minutes + " min = " + totalyears + " y and " + totalDays + " d");
        }

    }
    public static void main(String[] args) {

        printYearsAndDays(561600);

    }
}

