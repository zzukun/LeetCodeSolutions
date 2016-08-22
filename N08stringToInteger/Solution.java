package N08stringToInteger;

public class Solution {
	public int myAtoi(String str) {
		// 11ms
		if(str==null || str.length() ==0)
		{
			return 0;
		}
        char[] c = str.trim().toCharArray();
        int sign = 1;
        boolean haveSign = false;
        String res = "";
        if(c[0] == '-')
        {
        	sign=-1;
        	haveSign = true;
        }
        else if (c[0] == '+')
        {
        	haveSign = true;
        }
        
        int start_idx = 0;
        if(haveSign) start_idx = 1;
        
    	for(int i= start_idx;i<c.length;i++)
        {
        	if((int)c[i]<48 || (int)c[i]>57)
        	{
        		break;
        	}
        	res += c[i];
        }
        
        if(res.length() == 0)
        	return 0;
        int res_int;
        double res_doub = Double.valueOf(res) * sign;
        if(res_doub>Integer.MAX_VALUE)
        	res_int = Integer.MAX_VALUE;
        else if(res_doub<Integer.MIN_VALUE)
        {
        	res_int = Integer.MIN_VALUE;
        }else {
			res_int = (int)res_doub;
		}
		return res_int;
    }
	
	public static void main(String[] args) {
		// "2147483648"
		// "   -0012a42"
		// "9223372036854775809"
		int res = new Solution().myAtoi("-2147483648");
		System.out.println(res);
	}
}
