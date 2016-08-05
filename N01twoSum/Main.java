package N01twoSum;

public class Main {
	public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
		for(int i=0; i<nums.length; i++)
        {
        	int loss = target - nums[i];
    		for(int j=i+1;j<nums.length;j++)
    		{
    			if(nums[j] == loss)
    			{
    				result[0] = i;
    				result[1] = j;
    				return result;
    			}
    		}
        }
		return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {0, 4, 3, 0};
		int target = 0;
		int result[] = new Main().twoSum(nums, target);
		
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
}
