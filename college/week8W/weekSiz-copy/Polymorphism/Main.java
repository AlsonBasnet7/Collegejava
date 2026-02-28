package Polymorphism;

// Superclass
class OverRiding {
    void display() {
        System.out.println("Hello, This is superclass");
    }
}

// Subclass
class ExampleOver extends OverRiding {
    @Override
    void display() {
        System.out.println("Hi, This is subclass");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

    
        OverRiding obj2 = new ExampleOver();
        obj2.display();   // calls subclass method (runtime)
    }
}
