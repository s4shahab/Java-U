public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int seconds){

        if (seconds<0){
            return "Invalid data for seconds ("+seconds +") must be positive integer value";
        }
        else {
            int minutes=seconds/60;
            return getDurationString(seconds/60,seconds%60);

        }

//        Two step approach to get hours
//        int minutes=seconds/60;
//        int hours=minutes/60;
//        System.out.println("hours = "+hours);

//        For minutes
//        int remainingminutes=minutes%60;
//        System.out.println("Remainingminutes= "+remainingminutes);
//        System.out.println("minutes= "+minutes);

//        For seconds
//        int remainingseconds=seconds%60;
//        System.out.println("Remaining seconds= "+ remainingseconds);


//        return hours + " h " + remainingminutes + " m " + remainingseconds +" s";



    }

    public static String getDurationString(int minutes, int seconds){

        if (minutes<0){
            return "Invalid data for minutes ("+minutes +") must be positive integer value";
        }

        if (seconds<=0 || seconds>=59){
            return "Invalid data for seconds ("+seconds +") must be positive integer value and between 0 and 59";
        }

        int hours=minutes/60;
        int remainingminutes=minutes%60;
        int remainingseconds=seconds%60;

        return hours + " h " + remainingminutes + " m " + remainingseconds +" s";

    }
}
