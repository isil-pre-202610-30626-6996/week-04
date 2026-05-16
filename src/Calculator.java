public class Calculator {

    public static void getMax(int a, int b) {
        if (a > b ){
            System.out.println(a + " is greater than " + b + ".");
            return;
        }


        if (b > a) {
            System.out.println(b + " is greater than " + a + ".");
            return;
        }

        System.err.println("Both numbers are equal.");
    }
    
}
