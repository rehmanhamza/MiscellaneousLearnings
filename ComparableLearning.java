package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableLearning {

	public static void main(String[] args) {
		List<Laptops> laps = new ArrayList<>();
		
		laps.add(new Laptops("Apple", 16, 1200));
		laps.add(new Laptops("Dell", 4, 300));
		laps.add(new Laptops("Lenovo", 8, 450));
		laps.add(new Laptops("Fujitsu", 8, 350));
		
		// we can also use Comparator and solve the problem of sorting
		// works same as Comparable interface
		
		Comparator<Laptops> cmpt = new Comparator<Laptops>() {
			public int compare(Laptops l1, Laptops l2) {
				if(l1.getBrand().equals(l2.getBrand()))
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(laps, cmpt);
		for(Laptops l: laps) {
			System.out.println(l);
		}
	}

}
