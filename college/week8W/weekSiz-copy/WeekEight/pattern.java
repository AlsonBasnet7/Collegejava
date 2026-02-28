package WeekEight;


/**
 * Write a description of class pattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class pattern
{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number in One's Only");
      int ones=sc.nextInt();
      
      if(ones==1 || ones==11||ones==111||ones==1111||ones==11111){
      int result=ones^ones;
      System.out.println("The pattern of the entered number is"+result);
      
  }else{
      System.out.println("Please, enter the one's only");
  }
}
}