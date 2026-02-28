package WeekEight;

class NumberCheck {

 
    void check(int num) {
        if (num > 0)
            System.out.println("Number is Positive");
        else if (num < 0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number is Zero");
    }

    // Overloaded method
    void check(int num, boolean dummy) {
        if (num % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}

public class TestNumberCheck {
    public static void main(String[] args) {
        NumberCheck obj = new NumberCheck();
        obj.check(5);
        obj.check(5, true);
    }
}
