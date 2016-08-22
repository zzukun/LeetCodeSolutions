package N14LongestCommonPrefix;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0)
		{
			return "";
		}
		String comPrefix = "";
		int min_len = 9999;
		for(int i=0;i<strs.length;i++)
		{
			if(strs[i].length() < min_len)
			{
				min_len = strs[i].length();
			}
		}
		if(min_len == 0)
		{
			return "";
		}
		for(int i=0;i<min_len;i++)
		{
			boolean com = true;
			char commonChar = strs[0].charAt(i);
			for(int j=0;j<strs.length;j++)
			{
				if(strs[j].charAt(i) != commonChar)
					com = false;
			}
			if(com)
				comPrefix += commonChar;
			else
				break;
		}
		
		return comPrefix;
	}
	
	public static void main(String[] args) {
		//   {"abcd","abc","abcaaa"}
		//   {}
		String[] strs = {"abcd","abc","abcaaa"};
		String res = new Solution().longestCommonPrefix(strs);
		System.out.println(res);
	}
}
