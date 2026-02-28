package Polymorphism;


class Overloading{
    int add(int a, int b){
        return a+b;        
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int add(int a, int b, int c, int d){
        return a+b+c+d;
        
    }
}

public class overLoading{
    public static void main(String[] args){
        Overloading cal = new Overloading();
        System.out.println(cal.add(20,30));
        System.out.println(cal.add(20,30,40));
        System.out.println(cal.add(20,30,20,10));
        //dynamic behaviour
        new Overloading().add(20,20);
    }
}
    
