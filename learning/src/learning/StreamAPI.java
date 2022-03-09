package learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		
		// complete version not so efficient 
		Consumer<Integer> c = new Consumer<Integer>(){
			// anonymous class
			public void accept(Integer i){
				System.out.println(i);
			}
		};
		
		// efficient version of above Consumer interface implementation
		// using Lambda Expression
		Consumer<Integer> cc = i -> System.out.println(i);
		
		
		// forEach takes consumer interface 
		values.forEach(cc);
		
		// more efficient version
		values.forEach(i -> System.out.println(i));
		
		// using stream API
		// parallelStream uses multithreading and output is not
		// always in the same order or never
		values.parallelStream().forEach(System.out::println);
		values.stream().forEach(System.out::println);
		
	}

}

// we should never change/modify our interface
// default keyword was introduced in Java 8
/*
public interface Actor{
	void act();
	void speak();
	default void comedy(){
		System.out.println("I can make people laugh.");
	}
}

public class Hero implements Actor{
	public void act() {
		System.out.println("I can Act");
	}
	
	public void speak() {
		System.out.println("I can speak.");
	}
	
	public void comedy() {
		System.out.println("I can make people laugh");
	}
}


public class Villian implements Actor{
	public void act() {
		System.out.println("I can act");
	}
	
	public void speak() {
		System.out.println("I can speak");
	}
	
	public void rude() {
		System.out.println("I am rude");
	}
}*/