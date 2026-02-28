package Enccapsulation;
public class ATM
{
    private int PIN=1234;
    private int Balance=1000;
    private double deposit;
    private double withdraw;
    private double remainingAmount;
    //getter and setter
    //setter
    //if 5 times block the user
    public void setPIN(int pin){
        this.PIN = pin;        
    }
    public void SetBalance(int balance){
        this.Balance = balance;
    }
    //getter
    public int getPIN(){
        return this.PIN;
    }
    public int getBalance(){
        return this.Balance;
    }  
    public double get() {
        return Balance;
    }
    public void deposit(double amount) {
        if (amount >= 0) {
            this.deposit = this.deposit+ Balance;
        } else {
            System.out.println("Invalid amount");
        }
     }
    public void withdraw(double withdraw,int pin){
        int remainingAmount=0;
        if(this.PIN==pin)       
            if(withdraw>0){
                if(withdraw<=this.Balance){
                    this.withdraw=this.withdraw-Balance;
                    
                }else{
                    System.out.println("Ramro sanga halnus");
                }    
            } 
        }
    
    
    }

