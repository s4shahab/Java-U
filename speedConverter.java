public class speedConverter {
    public static long toMilesPerHour(double kiloMeterPerHour){
        if (kiloMeterPerHour<0){
            return -1;
        }
        else {
            return Math.round(kiloMeterPerHour/1.609);
        }
    }

    public static void printConversion(double kilometer){
        long x=toMilesPerHour(kilometer);
        if (x==-1){
            System.out.println("Invalid input");
        }
        else {
            System.out.println(kilometer + " km/h = " + x + " mi/h");
        }
    }
    public static void main(String[] args) {

    }
}
