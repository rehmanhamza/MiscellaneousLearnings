package learning;
import java.util.LinkedList;
import java.util.Collections;

public class Hello extends ListNode{
	
	public static void main(String[] args) {
		
		ListNode list = new ListNode();
		
		list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        
        //printList(list);
        //reverse(list);
        printList(list);
        removeNthFromEnd(list, 2);
        printList(list);
        
        // built-in LinkedList
        LinkedList<Integer> list2 = new LinkedList<>();
        
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        
        System.out.println("built-in LinkedList:\n" + list2);
        Collections.reverse(list2);
        list2.remove(2-1);
        Collections.reverse(list2);
        System.out.println(list2);
        
        
	}

}
