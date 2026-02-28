
/**
 * Write a description of class Bus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bus
{
    public static void main(String[] args){
        //datatypes [] indetifier;
        /*String [] seats= {"Sudip","Alson","Rushan","Gaurav"};
        //seats = new String[4];
        System.out.println(seats[0]);
        System.out.println(seats.length);
        System.out.println(seats[3]);
        for(int i =0;i<seats.length;++i){
            System.out.println( seats[i]);
        }
        for(String z: seats){
            System.out.println(z);
        }*/
        
        
        
        
        //datatype[][]identifier; first one is row and second one is column;
        
        // String [][]seats={
            // {"Anil","John","Alson"},
            // {"Sudip","Praful","Rushan"}
         // };
        // System.out.println(seats);
        // for(int i=0;i<seats.length;i++){
        // for (int j = 0; j < seats[i].length; j++) { 
            
            // System.out.println(""+seats [i] [j]);
        // }
        // System.out.println("");      
        //highest marks and lowest mark

        int [] marks={50,30,40,10};
//        //int lowest=marks[0];
        int avg=0;
        
        // for(int i=1;i<marks.length;i++){
            // if(marks[i]>highest){
                // highest=marks[0];
            // }
            // System.out.println(highest);
            
        
        for(int mark:marks)
        {
         avg+=mark;
        }
         double average=avg/marks.length;
         System.out.println(average);
        }
    }
    
    
    
    
