package N70ClimbingStairs;

public class Solution {
	final double sqrt5 = Math.sqrt(5);
	
	public int climbStairs(int n) {
        int curr = -1;
		
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else if(n>2){
			n = n + 1;
			double a = (1+sqrt5)/2.0;
			double b = (1-sqrt5)/2.0;
			double res = ( Math.pow( a , n) - Math.pow(b, n) ) / sqrt5;
			return (int)res;
		}
    	return curr;
    }
	
	public static void main(String[] args) {
		// 5 -> 8
		// 10 -> 89
		int res = new Solution().climbStairs(5);
		System.out.println(res);
	}
}
