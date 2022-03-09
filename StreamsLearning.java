package learning;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 
- A stream consists of source followed by zero or more intermediate methods combined 
  together (pipelined) and a terminal method to process the objects obtained from the 
  source as per the methods described.
- Stream is used to compute elements as per the pipelined methods without altering the 
  original value of the object.
  
*/

public class StreamsLearning {

	public static void main(String[] args) {
		// map: The map method is used to returns a stream consisting of the results of applying 
		// the given function to the elements of this stream.
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		List<Integer> squares = number.stream().map(x->x*x).collect(Collectors.toList());
		Set<Integer> square_set = number.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(squares);
		System.out.println(square_set);
		
		// forEach: The forEach method is used to iterate through every element of the stream.
		number.stream().map(x->x*x).forEach(y->System.out.print(y + " "));
		System.out.println();
		
		// reduce: The reduce method is used to reduce the elements of a stream to a 
		// single value.
		// Here ans variable is assigned 0 as the initial value and i is added to it.
		int even = number.stream().filter(x->x%2==0).reduce(0, (ans,i)-> ans+i);
		System.out.println("Sum of even numbers in List = " + even);
		
		// filter: The filter method is used to select elements as per the Predicate passed 
		// as argument.
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		List<String> result = // startsWith is case sensitive
				names.stream().filter(x->x.startsWith("S")).collect(Collectors.toList());
		
		System.out.println(result);
		
		// sorted: The sorted method is used to sort the stream.
		List<String> name = Arrays.asList("Reflection","Collection","Stream");
		List<String> sorted_result = name.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sorted_result);
	}

}
