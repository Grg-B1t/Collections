import java.util.LinkedList;
import java.util.List;

public class linkList {
    public static void main(String[] args) {
        LinkedList lnk = new LinkedList<>();

        lnk.add(1);
        lnk.add(5);
        lnk.add(3);

        System.out.println(lnk.size());
        System.out.println(lnk.get(1));
    
        LinkedList<String> lnk1 = new LinkedList<>();
        lnk1.add("Sam");
        lnk1.add("Ham");
        lnk1.add("Dam");
 
        System.out.println(lnk1);

        lnk1.addFirst("Bat");
 
        System.out.println(lnk1);
        
        lnk1.addLast("Hat");
 
        System.out.println(lnk1);

        lnk1.removeFirst();

        System.out.println(lnk1);
        
        lnk1.removeLast();

        System.out.println(lnk1);
        
        System.out.println(lnk1.getFirst() + " and " + lnk1.getLast());
    }
}
