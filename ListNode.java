package learning;

public class ListNode {
	Node head;
	
	// static class so that main can access it
	static class Node {
		int data;
		Node next;
		
		Node(int n) {
			data = n; 
			next = null; 
		}
	}
	
	// Method to insert a new node
	public static ListNode insert(ListNode list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		
		return list;
	}
	
	// Method to print the LinkedList
	public static void printList(ListNode list) {
		Node currentNode = list.head;
		
		System.out.println("Linked List: ");
		
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	// reversing a LinkedList
	public static ListNode reverse(ListNode list){
        Node current = list.head;
        Node previous = null;
        Node temp = null;
        
        while(current != null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        list.head = previous;
        
        return list;
    }
	   
    public static ListNode removeNthFromEnd(ListNode list, int n) {
    	list = reverse(list);
        Node next_node = null;
        Node current = list.head;
        
        if(n == 1){
            list.head = current.next;
        } else{
            for(int i=1; current != null && i<n-1; i++){
                current = current.next;
            }
            
            next_node = current.next.next;
            current.next = next_node;
        }
        return reverse(list);
    }
		
}