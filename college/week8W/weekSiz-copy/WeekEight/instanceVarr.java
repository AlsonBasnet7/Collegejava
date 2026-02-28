package WeekEight;
import java.util.*;
class Multiplication{
    int Multi(int num1, int num2){
        return num1*num2;
    }
}

public class instanceVarr
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        Multiplication obj = new Multiplication();
        int result = obj.Multi(num1,num2);
        System.out.println("The multiplication of two integers is"+result);
        
        
        
        
    }
}