package learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsLearning {

	public static void main(String[] args) {
		String[] things = {"beef", "chicken", "mutton", "vegetables"};
		List<String> list = new ArrayList<>();
		
		for(String x: things) {
			list.add(x);
		}
		
		System.out.println("list:\n" + list);
		
		String[] somemore = {"daal", "beef", "laser", "biryani", "mutton"};
		List<String> list1 = new ArrayList<>();
		
		for(String y: somemore) {
			list1.add(y);
		}
		
		System.out.println("list1:\n" + list1);
		
		editList(list, list1);
		
		System.out.println("edited list:\n" + list);
	}
	
	private static void editList(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			if(l2.contains(it.next())) {
				it.remove();
			}
		}
		
	}

}
