package N07reverseInteger;

public class Solution {
	public int reverse(int x)
	{
		String str = "" + x;
		
		int sign = 1;
		int idx= 0;
		double result = 0;
		if(str.charAt(idx) == '-')
		{
			sign = -1;
			idx++;
		}
		else if (str.charAt(idx) == '+')
		{
			idx++;
		}
		
		for(int i=str.length()-1; i>=idx;i--)
		{
			result = result * 10 + (str.charAt(i) - '0');
			//System.out.println(result);
		}
		
		if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
			return 0;
		
		return  sign * (int)result;
	}
	
	public static void main(String[] args) {
		int res = new Solution().reverse(1534236469);
		System.out.println(res);
	}
}
