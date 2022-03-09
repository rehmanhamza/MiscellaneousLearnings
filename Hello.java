import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        int count = 0;
        for(int i=2500; i<=3500; i++){
            if(i%2 == 0 && i%5 == 0){
                count++;
                //System.out.println(count + ". " + i);
            }
        }

        System.out.println("");
        int a = 13;
        int b = 11;
        int sum = a + b;

        if(sum > 21){
            if(a == 11){
                a = 1;
                sum = a + b;
                System.out.println("Sum = " + sum);
            }else if(b == 11){
                b = 1;
                sum = a + b;
                System.out.println("Sum = " + sum);
            }else{
                System.out.println("Sum = " + 0);
            }
        }else{
            System.out.println("Sum = " + sum);
        }

        // Leet Code
        int []nums = {1,2,3,4,5,6,7};
        
        /*for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        */

        String s = "Let's take LeetCode Contest";
        String[] str=s.split(" ");
        //System.out.println("str after split() = " + Arrays.toString(str));
	    String finalresult="";
	    
        for(int i=0; i<str.length; i++){
	   	    String result="";
	   	    for(int j=0; j<str[i].length(); j++){
	   		    result += str[i].charAt(str[i].length()-j-1);
	   	    }
	   	    result += " "; // adding spacing in modified array
	   	    finalresult += result;
	   }
       System.out.println(finalresult.trim());
       // String.trim() --> removes spacing in front and at the end of string, if any
       //return finalresult.trim();
       System.out.println(System.getProperty("java.specification.version"));
    }
}

/*
public void helper(int[] nums, int startIdx, int endIdx) {
        // reverse whole nums
        int i = startIdx;
        int j = endIdx;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        helper(nums, 0, nums.length-1);
        helper(nums, 0, k-1);
        helper(nums, k, nums.length-1);
    }

*/

/*
public ListNode reverse(ListNode l1){
        ListNode curr = l1;
        ListNode prev = null;
        ListNode temp = null;
        
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head=reverse(head);
        ListNode nxt=null;
        ListNode curr=head;
        
        if(n==1){
            head=curr.next;
        } else{
            for(int i=1; curr!=null && i<n-1; i++){
                curr=curr.next;
            }
            
            nxt=curr.next.next;
            curr.next=nxt;
        }
        return reverse(head);
    }

*/