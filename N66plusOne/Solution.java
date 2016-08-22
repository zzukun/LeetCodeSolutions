package N66plusOne;

import java.util.ArrayList;

public class Solution {
	public int[] plusOne(int[] digits) {
		if(digits == null || digits.length == 0){
			return null;
		}
		digits[digits.length-1] ++;
		
		int carry = 0;
        ArrayList<Integer> res = new ArrayList<>();
		for(int i=digits.length-1;i>=0;i--){
			int sum=digits[i] + carry;
        	res.add(sum%10);
        	carry = sum/10;
        }
		if(carry == 1)
			res.add(1);
		int[] res_arr = new int[res.size()];
		int pos=0;
		for(int i=res.size()-1;i>=0;i--){
			
			res_arr[pos] = res.get(i);
			pos++;
		}
		return res_arr;
    }
	
	public static void main(String[] args) {
		int[] in = {9,9,9};
		int[] out = new Solution().plusOne(in);
		for(int i=0;i<out.length;i++){
			System.out.print(out[i]+" ");
		}
	}
}
