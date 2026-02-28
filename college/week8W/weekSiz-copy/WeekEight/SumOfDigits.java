package WeekEight;

class SumOfDigits {

    int calculateSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        int result = obj.calculateSum(123);
        System.out.println("Sum of digits: " + result);
    }
}

