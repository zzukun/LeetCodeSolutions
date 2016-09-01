package N67AddBinary;

public class Solution {
	
	public String addBinary(String a, String b) {
        int max_bits = -1;
        if(a.length()>b.length()){
        	max_bits = a.length();
        }else{
        	max_bits = b.length();
        }
        
        int[] a_arr = new int[max_bits];
        int[] b_arr = new int[max_bits];
        int[] result = new int[max_bits+1];
        
        for(int i=0;i<max_bits;i++){
        	if(a.length()-1-i>=0){
        		a_arr[i] = a.charAt(a.length()-1-i) - '0';
        	}
        	else
        		a_arr[i] =0;
        	if(b.length()-1-i>=0){
        		b_arr[i] = b.charAt(b.length()-1-i) - '0';
        	}
        	else
        		b_arr[i] =0;
        }
        
//        for(int i=0;i<a_arr.length;i++){
//        	System.out.print(a_arr[i]);
//        }
//        System.out.println();
//        for(int i=0;i<b_arr.length;i++){
//        	System.out.print(b_arr[i]);
//        }
        int carry = 0;
        for(int i=0;i<max_bits;i++){
        	result[i] = (a_arr[i] + b_arr[i] + carry) % 2;
        	carry = (a_arr[i] + b_arr[i] + carry) / 2;
        }
        if(carry == 1){
        	result[max_bits] = 1;
        }
        
//        for(int i=0;i<result.length;i++){
//        	System.out.print(result[i]);
//        }
        
        int pos = max_bits;
        //while(result[pos] == 0 && pos>=0){
        //	pos--;
        //}
        String result_str = "";
        boolean flag = true;
        while(pos>=0){
        	if(result[pos] == 0 && flag)
        		pos--;
        	else{
        		flag = false;
        		result_str += result[pos];
        		pos--;
        	}
        }
        if(result_str == ""){
        	return "0";
        }else
        	return result_str;
    }
	
	public static void main(String[] args) {
		String res = new Solution().addBinary("10", "11");
		System.out.println(res);
	}
}
