package N02addTwoNum;

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	public class ListNode {
		int val;
		ListNode next;
		// ListNode(int x) { this.val = x; }
		ListNode(int x) { val = x; }
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode curr_1 = l1;
		ListNode curr_2 = l2;
		ListNode res_start = null;
		ListNode res_curr = null;
		
		int next_plus =0;
		while(curr_1 != null || curr_2 != null)
		{
			if(curr_1 != null && curr_2 != null)
			{
				ListNode newNode = new ListNode((curr_1.val + curr_2.val + next_plus) % 10);
				next_plus = (curr_1.val + curr_2.val + next_plus) / 10;
				if(res_start == null)
				{
					res_start = newNode;
					res_curr = res_start;
				}
				else
				{
					res_curr.next = newNode;
					res_curr = res_curr.next;
				}
				curr_1 = curr_1.next;
				curr_2 = curr_2.next;
			}
			else if(curr_2 == null)
			{
				ListNode newNode = new ListNode( (curr_1.val + next_plus) % 10 );
				next_plus = (curr_1.val + next_plus) / 10;
				
				res_curr.next = newNode;
				res_curr = res_curr.next;
				
				curr_1 = curr_1.next;
			}
			else if(curr_1 == null)
			{
				ListNode newNode = new ListNode( (curr_2.val + next_plus) % 10 );
				next_plus = (curr_2.val + next_plus) / 10;
				
				res_curr.next = newNode;
				res_curr = res_curr.next;
				
				curr_2 = curr_2.next;
			}
		}
		if(next_plus == 1)
		{
			ListNode newNode = new ListNode( 1 );
			res_curr.next = newNode;
		}
        return res_start;
    }
	
	public void run()
	{
		//int[] arr1 = {2, 4, 3};
		//int[] arr2 = {5, 6, 4};
		
		ListNode l1_1 = new ListNode(2);
		ListNode l1_2 = new ListNode(4);	l1_1.next = l1_2;
		ListNode l1_3 = new ListNode(5);	l1_2.next = l1_3;
		ListNode l1_4 = new ListNode(9);	l1_3.next = l1_4;
		
		ListNode l2_1 = new ListNode(5);
		ListNode l2_2 = new ListNode(6);	l2_1.next = l2_2;
		ListNode l2_3 = new ListNode(4);	l2_2.next = l2_3;
		
		ListNode res = new Solution().addTwoNumbers(l1_1, l2_1);
		System.out.println(res.val);
		while(res.next != null)
		{
			res = res.next;
			System.out.println(res.val);
		}
	}
	
	public static void main(String[] args) {
		new Solution().run();
	}
}


