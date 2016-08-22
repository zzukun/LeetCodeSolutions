package N09PalindromeNumber;

public class Solution {
	public boolean isPalindrome(int x)
	{
		//boolean isPalin = true;
		// 负数不算回文！
		String str = "" + x;
		int len = str.length()/2;
		//System.out.println(len);
		for(int i=0;i<len;i++)
		{
			//System.out.println(str.charAt(i) + " \t" + str.charAt(str.length()-1-i));
			if(str.charAt(i) != str.charAt(str.length()-1-i))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean ans = new Solution().isPalindrome(12321);
		if(ans)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
