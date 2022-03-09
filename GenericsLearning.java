package learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class Container<T>{
	T value;
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.println(value.getClass().getName());
	}
}

public class GenericsLearning {

	public static void main(String[] args) {
		Container<String> obj = new Container<>();
		obj.value = "\0";
		obj.show();
		
		int value0[] = new int[4];
		Object value1[] = new Object[4];
		Collection value2 = new ArrayList();
		value2.add(3);
		value2.add("Navin");
		value2.add(5.8f);
		
		// ways to print a Collection
		// iterator 
		// enhanced for-loop
		// ForEach() Stream API
		
		/*
		Iterator itr = value2.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Object v : value2) {
			System.out.println(v);
		}
		
		value2.forEach(System.out::println);
		
		*/
		
		
		List<Integer> value3 = new ArrayList<>();
		value3.add(33);
		value3.add(44);
		value3.add(4);
		value3.add(6);
		value3.add(88);
		value3.add(679);
		
		Comparator<Integer> cmpt = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2) // if(o1%10 > o2%10) compare based on last digit
					return -1;
				return 1;
			}
			
		};
		
		// Lambda 
		Comparator<Integer> cmpt1 = (o1, o2) -> {
			return o1 > o2 ? 1 : -1;
 		};
 		
		Collections.sort(value3, cmpt1); // will not work on value2 because they are objects
		//value3.forEach(System.out::println); // Stream API, Lambda Expression
		//Collections.reverse(value3);
		value3.forEach(System.out::println);
		
		
		
		Vector v = new Vector<>(); // more like dynamic arrays
		v.add(4);
		v.add(5);
		
		System.out.println("Capacity of Vector v = " + v.capacity()); // will increase the capacity by 100%
		
		for(Object i : v) {
			System.out.println(i);
		}
		
		// Vectors wastes a lot of memory as compared to ArrayList.
		// Vectors are ThreadSafe whereas ArrayList are not ThreadSafe
		// Vectors are slow whereas ArrayList are fast
		
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(1,55));
		studs.add(new Student(2,95));
		studs.add(new Student(3,85));
		studs.add(new Student(4,65));
		studs.add(new Student(5,75));
		
		/*
		Collections.sort(studs, (s1, s2) -> {
			return s1.marks > s2.marks ? -1 : 1;
		});
		*/
		
		Collections.sort(studs);
		for(Student s : studs) {
			System.out.println(s);
		}
		
		// for customs class Comparable is preferred but for 
		// built-in classes Comparator is good to use.
		
	}

}

class Student implements Comparable<Student>{
	int SSN;
	int marks;
	
	public Student(int sSN, int marks) {
		//super();
		this.SSN = sSN;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [SSN=" + SSN + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.marks > o.marks ? -1 : 1;
	}
	
}
