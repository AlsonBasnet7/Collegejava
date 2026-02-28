class Animal{
    public String type;//attribute

    public Animal(String type) {
        this.type=type;
    }
    public boolean isFly(boolean tf){
        return tf;

    }
 

    
    // void display(){
        
    //     System.out.println("Dog is..."+this.type);
    // }

    void Run(){
        System.err.println(this.type+" is running");
    }
    
    void eat(){
        System.err.println("There was a gender race and sudip came fourth");
    }

    void makeSound(){
        System.out.println("Animal is making sound");
    }
}
class dog extends Animal{
    dog(){
    super("I mean sudip is still running");
    }
    void display(){
        
        System.out.println("Dog is..."+super.type);
        boolean canFly= super.isFly(true);
        if(canFly){
            System.err.println("It can fly");
        }else{
            System.err.println("It cannt fly");
        }
    }
    
    //  void eat(){
    //     System.err.println("Dog is eating");
    void dogRun(){
    super.Run();
    }
    
    
    void bark(){
        System.err.println("Sudip  is barking");
    }

public class one{
    public static void main(String[] args) {
        dog d = new dog();
        d.makeSound();
        d.bark();
        d.eat();
        d.display();
        d.dogRun();
        
        
    }
}}