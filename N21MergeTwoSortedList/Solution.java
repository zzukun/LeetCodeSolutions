package N21MergeTwoSortedList;

public class Solution {
	public class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) { val = x; }
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode merged_head;
		ListNode merged_curr;
		ListNode l1_curr = l1;
		ListNode l2_curr = l2;
		
		if(l1_curr == null){
			return l2;
		}
		else if(l2_curr == null){
			return l1;
		}
		else if(l1_curr!=null && l2_curr!=null){
			if(l1_curr.val>l2_curr.val){
				merged_head = new ListNode(l2_curr.val);
				merged_curr = merged_head;
				l2_curr = l2.next;
			}
			else{
				merged_head = new ListNode(l1_curr.val);
				merged_curr = merged_head;
				l1_curr = l1.next;
			}
			
			while( l1_curr!=null || l2_curr!=null ){
				if(l1_curr == null){
					merged_curr.next = l2_curr;
					break;
				}
				else if(l2_curr == null){
					merged_curr.next = l1_curr;
					break;
				}
				else{
					if(l1_curr.val > l2_curr.val){
						merged_curr.next = new ListNode(l2_curr.val);
						merged_curr = merged_curr.next;
						l2_curr = l2_curr.next;
					}else{
						merged_curr.next = new ListNode(l1_curr.val);
						merged_curr = merged_curr.next;
						l1_curr = l1_curr.next;
					}
				}
			}
			
			return merged_head;
		}
		else {
			return null;
		}
    }
	
	public void run(){
		ListNode l1_1 = new ListNode(2);
		ListNode l1_2 = new ListNode(5); l1_1.next = l1_2;
		ListNode l1_3 = new ListNode(6); l1_2.next = l1_3;
		
		ListNode l2_1 = new ListNode(2);
		ListNode l2_2 = new ListNode(3); l2_1.next = l2_2;
		ListNode l2_3 = new ListNode(7); l2_2.next = l2_3;
		ListNode l2_4 = new ListNode(11); l2_3.next = l2_4;
		
		ListNode res = mergeTwoLists(l1_1, l2_1);
		
		while(res != null)
		{
			System.out.print( res.val + " ");
			res = res.next;
		}
	}
	
	public static void main(String[] args) {
		new Solution().run();
	}
}
