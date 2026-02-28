import java.util.ArrayList;
import java.util.Scanner;

public class Districts {
   public Districts() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] names = new String[]{"Morang", "Kathmandu", "Kski", "Sindhuli"};

      for(int i = 0; i < names.length; ++i) {
         System.out.println(i + 1 + "." + names[i]);
      }

      ArrayList<String> updated = new ArrayList();
      System.out.println("Enter the number of new values you want to display");
      int n = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the new values" + n);

      for(int i = 0; i < n; ++i) {
         updated.add(sc.nextLine());
      }

      System.out.println("The new districts are:" + String.valueOf(updated));
      
   }
}