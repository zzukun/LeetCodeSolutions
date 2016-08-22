package N27RemoveElem;

public class Solution {
	public int removeElement(int[] nums, int val) {
		int cnt = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i] == val){
				for(int j=i+1;j<nums.length;j++){
					if(nums[j]!=val){
						nums[i] = nums[j];
						nums[j] = val;
						break;
					}
				}
			}
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i] != val )
				cnt++;
			else
				break;
		}
			
		return cnt;
	}
	
	public static void main(String[] args) {
		int[] arr = {3 ,2 ,2, 3};
		int res = new Solution().removeElement(arr, 3);
		System.out.println(res);
	}
}
