import java.util.*;

public class MapIteration {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }

        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");

        for(String myString : a){
            System.out.println(myString);
        }

    }
}