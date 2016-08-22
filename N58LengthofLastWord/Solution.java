package N58LengthofLastWord;

public class Solution {
	public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        if(arr.length == 0)
        	return 0;
        String last=arr[arr.length-1];
		return last.length();
    }
	
	public static void main(String[] args) {
		int res = new Solution().lengthOfLastWord(" ");
		System.out.println(res);
	}
}
