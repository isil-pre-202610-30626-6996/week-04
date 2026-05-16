
public class Calculator {

    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b + ".");
            return;
        }

        if (b > a) {
            System.out.println(b + " is greater than " + a + ".");
            return;
        }

        System.err.println("Both numbers are equal.");
    }

    public static int executeOperation(int a, int b, char operator) {
        int result = 0;
        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> throw new AssertionError();
        }
        return result;
    }

    public static void displayEvenNumbers(int min, int max) {
        while (min <= max) { 
            if (min % 2 == 0) {
                System.out.println(min + " is an even number.");
            }
            min++;
        }
    }

    public static void calculateMultiplesOfSix(int min, int max) {
        int count = 0;

        for (int i = min; i <= max; i++) {
            if (i % 6 == 0) {
                count++;
            }
        }

        System.out.println("There are " + count + " multiples of six.");
    }

}
