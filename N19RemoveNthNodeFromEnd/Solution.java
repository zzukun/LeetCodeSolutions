package N19RemoveNthNodeFromEnd;

public class Solution {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){ val = x;}
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev_n  = head;
        ListNode curr = head;
        for(int i=0;i<n;i++)
        {
        	curr = curr.next;
        }
        if(curr == null)
        {
        	return head.next;
        }
        //System.out.println(prev_n.val + "\t" + curr.val);
        while(curr.next != null)
        {
        	curr = curr.next;
        	prev_n = prev_n.next;
        }
        prev_n.next = prev_n.next.next;
		
		return head;
    }
	
	public void run()
	{
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);	l1.next = l2;
		ListNode l3 = new ListNode(3);	l2.next = l3;
		ListNode l4 = new ListNode(4);	l3.next = l4;
		ListNode l5 = new ListNode(5);	l4.next = l5;
		
		ListNode res =removeNthFromEnd(l1, 2);
		
		while(res!=null)
		{
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	public static void main(String[] args) {
		
		
		new Solution().run();
	}
}
