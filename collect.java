import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collect{
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<>();

        List<Integer> l = new ArrayList<>();

        al.add(1);
        al.add(5);
        al.add(3);

        l.addAll(al);

        Collections.sort(al);

        System.out.println(al);
        
    }
}