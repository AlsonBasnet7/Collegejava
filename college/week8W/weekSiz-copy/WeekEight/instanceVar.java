package WeekEight;


/**
 * Write a description of class instanceVar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class instanceVar
{
    //Instance method
    void great(){
        System.out.println("Hello from instance method!");
    }
    public static void main(String [] args){
        //cannot call directly using class name
        //InstanceMethod.greet();//error
        //call using object
        instanceVar obj=new instanceVar();
        obj.great();
        //call using new object directly.
        new instanceVar().great();
    }
    
}