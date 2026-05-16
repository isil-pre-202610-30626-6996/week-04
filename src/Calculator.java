
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

}
