package N38CountandSay;

public class Solution {
	public String countAndSay(int n) {
		n--;
        String result = "1";
		
        for(int i=0; i<n; i++){
        	char c = result.charAt(0);
        	String newResult = "";
        	int cnt=0;
        	for(int j=0;j<result.length();j++){
        		cnt++;
        		if(result.charAt(j) != c)
        		{
        			newResult += (""+(cnt-1)+c);
        			c = result.charAt(j);
        			cnt=1;
        		}
        		if(j == result.length()-1){
        			newResult += (""+cnt+c);
        		}
        	}
        	//System.out.println(i + "\t" + newResult);
        	result = newResult;
        }
        //System.out.println(result);
        return result;
    }
	
	public static void main(String[] args) {
		String res = new Solution().countAndSay(3);
		System.out.println(res);
	}
}
