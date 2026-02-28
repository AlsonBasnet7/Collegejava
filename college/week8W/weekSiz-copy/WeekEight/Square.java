package WeekEight;


/**
 * Write a description of class square here.
 *
 * @author Alson Basnet
 * @version 4th Jan
 */
class Square{
    int squareNumber(int n){
        //calculate square and return the square value
        int square=n*n;
        return square;
    }

//main method    
    public static void main(String[] args){
        Square obj = new Square();
        int finalResult = obj.squareNumber(2);
        System.out.println("The square of the number is"+ finalResult);  

    }
    
}