package Abstraction;
abstract class PaymentMethod{
    abstract void processPayment();
    abstract void verifyBalance();
}
class Esewa extends PaymentMethod{//parent class
    @Override
    void processPayment(){
        System.out.println("Esewa payment process...");
    }
    @Override
    void verifyBalance(){
        System.out.println("Esewa verify process");
    }
}
class khalti extends PaymentMethod{
     @Override
     void processPayment(){
         System.out.println("Khalti payment processe...");
     }
     @Override
     void verifyBalance(){
         System.out.println("khalti verify process");
         
     }
}
class Paypal extends PaymentMethod{ 
    
    
}
public class TestAbstraction
{
    public static void mian(String[] args){
        
    }
    
    
}