import java.util.*;

public class Learn{
    public static void main(String[] args){
        // Default Initialization of a Map
        Map <String, Integer> hm = new HashMap<>();

        // Initialization of a Map using Generics
        Map <Integer, String> hm1 = new HashMap<Integer, String>();

        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));

        // Traversing through the map
        for(Map.Entry me: hm.entrySet()){
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        // HashMap will print always in increasing order of key
        // no matter if key is Integer or String
        hm1.put(new Integer(1), "Ali");
        hm1.put(new Integer(2), "Aslam");
        hm1.put(new Integer(3), "Akram");
        hm1.put(new Integer(4), "Gohar");

        System.out.println(hm1);

        // LinkedHashMap is just like HashMap with an additional 
        // feature of maintaining an order of elements inserted into it.
        Map <Integer, String> hm2 = new LinkedHashMap<>();

        hm2.put(new Integer(10), "Italy");
        hm2.put(new Integer(20), "Germany");
        hm2.put(new Integer(30), "France");
        hm2.put(new Integer(5), "Belgium");

        System.out.println("\nLinkedHashMap:\n" + hm2);
        /*for(Map.Entry me: hm2.entrySet()){
            System.out.println(me.getKey() + ":" + me.getValue());
        }*/
    }
} 