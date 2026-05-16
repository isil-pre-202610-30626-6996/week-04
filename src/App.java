public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Carlos Paredes", 12);

        if (student.isPassed()) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has not passed.");
        }

        Calculator.getMax(20, 20);

        System.out.println("Result: " + Calculator.executeOperation(5, 15, '-'));

        Calculator.displayEvenNumbers(5, 25);

        Calculator.calculateMultiplesOfSix(1, 24);

        System.out.println(Calculator.calculateFactorial(9));

    }
}
