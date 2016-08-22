package N08stringToInteger;

public class Solution1 {
	public int myAtoi(String str)
	{
		// 3ms
		//null字符串和空字符串返回0
		if(str==null || str.length() ==0)
			return 0;
		//正负号
		int sign = 1;
		double result = 0;    // long不可以，由于"9223372036854775809"
		
		int idx =0;
		
		//去除前面的空格
		while(str.charAt(idx) == ' ')
			idx++;
		
		if(str.charAt(idx) == '-')
		{
			sign = -1;
			idx++;
		}
		else if(str.charAt(idx) == '+')
		{
			idx++;
		}
		
		for(int i=idx;i<str.length();i++)
		{
			if((int)str.charAt(i) < 48 || (int)str.charAt(i) > 57)
				break;
			else
			{
				result = result *10 + (str.charAt(i) - '0');
			}
		}
		
		result = result * sign;
		
		//判断超界限的值
		if(result>Integer.MAX_VALUE)
			result = Integer.MAX_VALUE;
		else if(result<Integer.MIN_VALUE)
			result = Integer.MIN_VALUE;
		
		return (int)result;
	}
	
	public static void main(String[] args) {
		int res = new Solution1().myAtoi("9223372036854775809");
		System.out.println(res);
	}
}
