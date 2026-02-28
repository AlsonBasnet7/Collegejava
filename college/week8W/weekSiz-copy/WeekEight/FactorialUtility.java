package WeekEight;

class FactorialUtility {

    static void displayFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
