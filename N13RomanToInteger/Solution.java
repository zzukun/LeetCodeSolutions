package N13RomanToInteger;

public class Solution {
	public int romanToInt(String s) {
		int sum = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'I'){
				sum += 1;
				if(i+1<s.length())
					if(s.charAt(i+1) != 'I')
						sum -= 2;
			}
			else if(s.charAt(i) == 'X'){
				sum += 10;
				if(i+1<s.length())
					if(s.charAt(i+1) != 'I' && s.charAt(i+1) != 'X' && s.charAt(i+1) != 'V')
						sum -= 20;
			}
			else if(s.charAt(i) == 'C'){
				sum += 100;
				if(i+1<s.length())
					if(s.charAt(i+1) != 'I' && s.charAt(i+1) != 'X' && s.charAt(i+1) != 'C' && s.charAt(i+1) != 'V' && s.charAt(i+1) != 'L')
						sum -= 200;
			}
			else if(s.charAt(i) == 'M'){
				sum += 1000;
			}
			else if(s.charAt(i) == 'V'){
				sum += 5;
			}
			else if(s.charAt(i) == 'L'){
				sum += 50;
			}
			else if(s.charAt(i) == 'D'){
				sum += 500;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// MCMLXXX   1980
		// DCXXI   621
		// MCMXCVI   1996
		int res = new Solution().romanToInt("DCXXI");
		System.out.println(res);
	}
}
