public class whileLoop {
    public static void main(String[] args) {
        int j=1;
        while (true){
            if (j>10){
                break;
            }

            System.out.println("while loop "+ j);
            j++;

        }

//        do while loop

        int k=0;
        do {
            System.out.println("This is do while loop ");
            k++;
        }while (k<0);

    }
}
