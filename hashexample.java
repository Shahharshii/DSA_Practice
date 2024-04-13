import java.util.HashMap;

public class hashexample {
    public static void main(String[] args) {
        HashMap<String, Integer> mymap = new HashMap<>();
        mymap.put("hello", 1);
        mymap.put("world", 2);
        mymap.put("bye", 3);
        // System.out.println(mymap.containsKey("heyaaa"));
        // System.out.println(mymap.containsKey("world"));
        // System.out.println(mymap);
        for(String myKey : mymap.keySet()) {
            System.out.println(myKey );
    }

}
}
