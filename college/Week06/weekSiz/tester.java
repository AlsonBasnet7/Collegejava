
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class animal{
    void makeSound(){
    System.out.println("Animal is");
}
}
class dog extends animal{
    void bark(){
        System.out.println("Dog is barking");
        
    }}
    
public class tester
{
  public static void main(String[] args){
      dog d = new dog();
      d.makeSound();
      d.bark();
      
  }
}