import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Sam");
        hm.put(2, "Dam");
        hm.put(3, "Ham");

        System.out.println(hm);

        hm.remove(2);
        System.out.println(hm);
    }
}
