//take age from the user and print wheather adult or not also through exeption if the age is less than 18
import java.util.*;
public class aga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();         
        try {
            if (age < 18) {
                throw new Exception("You are not an adult.");
            } else {
                System.out.println("Your age is more than 18.");
            }
        } catch (Exception e) {
            System.out.println("Age is greater than 18");
        } finally {
            System.err.println("Good");
            sc.close();
        }
    }
    

}
