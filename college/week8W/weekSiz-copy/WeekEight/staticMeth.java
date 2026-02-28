package WeekEight;


/**
 * Write a description of class staticMeth here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class staticMeth
{
    // static method
    static void greet(){
        System.out.println("Hello from static method");
    }
    
    public static void main(String[] args){
        // calling static method using clss name
        staticMeth.greet();
        
        //calling static method using object reference
        staticMeth obj= new staticMeth();
        obj.greet();
        
        //calling static method using null references
        staticMeth ref=null;
        ref.greet();
    }
}
        