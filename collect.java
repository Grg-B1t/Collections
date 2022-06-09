import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collect{
    public static void main(String[] args) {
        
        List<list> lst = new ArrayList<>();

        list p1 = new list(4, "Harry", 80000.00);

        lst.add(new list(1, "Sam", 75000.00));
        lst.add(new list(2, "Dam", 78000.00));
        lst.add(new list(5, "Ham", 65000.00));
        lst.add(p1);
        lst.add(new list(3, "Pam", 75000.00));


        lst.remove(p1);

        System.out.println(lst);
    }
}