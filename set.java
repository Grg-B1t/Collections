import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();

        hs.add(1);
        hs.add(5);
        hs.add(9);
        hs.add(9);
        hs.add(10);
        hs.add("Sam");
        hs.add("Sam");
        hs.add("sam");

        System.out.println(hs);
        System.out.println(hs.size());
        
        
    }
}
