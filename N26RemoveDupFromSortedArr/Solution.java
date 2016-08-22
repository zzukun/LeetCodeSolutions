package N26RemoveDupFromSortedArr;

public class Solution {
	public int removeDuplicates(int[] nums) {
		if(nums.length == 1 || nums.length == 0){
			return nums.length;
		}
		
		int max_pos =0;
		for(int i=max_pos;i<nums.length;i++){
			if(nums[i] > nums[max_pos]){
				max_pos++;
				nums[max_pos] = nums[i];
			}
			//for(int num:nums){
			//	System.out.print(num + " ");
			//}
			//System.out.println();
			//if(nums[max_pos] == nums[nums.length-1])
			//	break;
		}
		
		return max_pos+1;
    }

	public static void main(String[] args) {
		//int[] test = {1, 1, 2, 3, 3, 3, 4};
		//int[] test = {1, 1, 1, 1};
		//int[] test = {1, 2, 2, 3};
		int[] test = {0,0,0,0,0,1,2,2,3,3,4,4};
		int res = new Solution().removeDuplicates(test);
		System.out.println(res);
	}
}
