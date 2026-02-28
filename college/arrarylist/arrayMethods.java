package college.arrarylist;
import java.util.ArrayList;
public class arrayMethods{
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Hari");
        list.add("Ram");
        list.add("Roman");
        list.add("John");
        list.remove("Hari");
        System.out.println(list);
        String names=list.get(1);
        System.out.println(names);


    }
}