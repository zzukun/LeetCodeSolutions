package N28ImplementStr;

public class Solution {
	public int strStr(String haystack, String needle) {
		if(needle.equals("")){
			return 0;
		}
		if(haystack.length() < needle.length()){
			return -1;
		}
		for(int i=0;i<haystack.length();i++){
			if(haystack.charAt(i) == needle.charAt(0)){
				if(needle.length() == 1)
					return i;
				else
					if(needle.length() > haystack.length() - i){ // 剩余字符串长度小于needle，提前停止，节约运算时间
						return -1;
					}
					for(int j=1;j<needle.length();j++){
						if(haystack.charAt(i+j) != needle.charAt(j))	
							break;
						if(j == needle.length()-1)
							return i;
					}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//"mississippi"   "issipi"
		// "a"   "a"
		int res = new Solution().strStr("mississippi", "issipi");
		System.out.println(res);
	}
}
