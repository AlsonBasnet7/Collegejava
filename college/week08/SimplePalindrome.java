import java.util.*;

public class SimplePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();
        
        String reversed = new StringBuilder(str).reverse().toString();
        
        if(str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
        sc.close();
    }
}
