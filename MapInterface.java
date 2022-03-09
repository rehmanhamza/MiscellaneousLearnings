package learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapInterface {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("myName", "Hamza");
		map.put("actor", "Leo");
		map.put("ceo", "Jobs");
		
		// in HashMap the values are randomly stored
		// for no available key it will output null
		System.out.println(map.get("acr"));
		
		Set<String> keys = map.keySet();
		
		// this won't work let's try Stream API
		//Collections.sort(map);
		
		// Method - 1
		System.out.println("\nMethod - 1 for sorting a map using Key.");
		
		HashMap<String, String> temp = map.entrySet().stream().sorted((i1, i2) -> 
		i1.getKey().compareTo(i2.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry
				::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		for(Map.Entry<String, String> entry : temp.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value =  " + entry.getValue());
		}
		
		// Method - 2
		// using Collections.sort() but modified version, using ArrayList()
		
		System.out.println("\nMethod - 2 for sorting a map using Key.");
		ArrayList<String> temp1 = new ArrayList<>(map.keySet());
		
		Collections.sort(temp1);
		
		for(String x : temp1) {
			System.out.println("Key = " + x + ", Value = " + map.get(x));
		}
		//Map<String, String> map1 = new Hashtable<>();
		// people rarely use Hashtable(), HashMap() is widely used
	}

}
