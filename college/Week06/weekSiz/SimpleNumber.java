
/**
 * Write a description of class SimpleNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class SimpleNumber
{ 
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] numbers={10,20,30,40,50};
    for(int number : numbers){
        System.out.println("Printing each number "+number);  
    }
    int sum=0;
    for(int i=0;i<numbers.length;i++){
        sum = sum + numbers[i] ;  
    }
    System.out.println("The sum of above arrat is "+sum);
    double average=sum/numbers.length;
    System.out.println("The average of the number is "+average);
    int highestNumber = numbers[0];
    int lowestNumber=numbers[0];
    for(int i=0;i<numbers.length;i++){
     if(highestNumber<numbers[i]){
        highestNumber= numbers[i];
    }
     if(lowestNumber>numbers[0]){
        lowestNumber=numbers[i];
    }
    System.out.println("The highest number is: "+ highestNumber);
    System.out.println("The lowest number is: " +lowestNumber);

    //make it dynamic
    ArrayList<String> updated= new ArrayList<>();
    System.out.println("Enter the new values");
    int n= sc.nextInt();

    sc.nextLine();
    System.out.println("Enter "+n);
    for(i=0;i<n;i++){
        updated.add(sc.nextLine());
    }
    System.out.println("The updated list is: "+updated);

    
    




    

    

}}}
