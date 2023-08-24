public class U_01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        boolean isAlien=false;
        if (isAlien==false){
            System.out.println("This is is not an Alien");
        }
        else
            System.out.println("This is Alien");

        boolean isa=false;
        if (!isa){
            System.out.println("isa is printing");
        }

        double x=20d;
        double y=80d;
        double total=100d*(x+y);
        double remin=total%40d;
        System.out.println("The reminder is "+remin);

        boolean out;
        if (remin==0){
            out=true;

        }
        else {
            out=false;
        }

        System.out.println(out);


    }
}
