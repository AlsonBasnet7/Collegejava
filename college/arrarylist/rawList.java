package college.arrarylist;
import java.util.ArrayList;
public class rawList{
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();//raw arraylist
        //So while creating a raw array we do not specificy the data types. we can add any value there. But there's a chances of run time error.

        list.add("Alson");
        //list.add(1);
        list.add("Basnet");
        //list.add(true);
        System.out.println(list);

        

    }
}
