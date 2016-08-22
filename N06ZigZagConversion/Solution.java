package N06ZigZagConversion;

public class Solution {
	public String convert(String s , int numRows)
	{
		if(numRows == 1)
		{
			return s;
		}
		int s_len = s.length();
		//声明数组，并初始化
		char[][] unfold = new char[numRows][s_len];
		for(int i=0;i<numRows;i++)
		{
			for(int j = 0 ; j < s_len; j++)
			{
				unfold[i][j] = '0';
			}
		}
		
		int row_idx = 0;
		boolean zig =true;
		int col_idx = 0;
		for(int i=0;i<s_len;i++)
		{
			unfold[row_idx][col_idx] = s.charAt(i);
			
			if(row_idx == numRows-1)
			{
				zig = false;
				col_idx ++;
			}
			else if(row_idx == 0)
				zig = true;
			
			if(zig)
				row_idx++;
			else
			{
				row_idx--;
				col_idx++;
			}
		}
		
		String result = "";
		for(int i=0;i<numRows;i++)
		{
			for(int j = 0 ; j < s_len; j++)
			{
				if(unfold[i][j] != '0')
				{
					result += unfold[i][j];
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// "PAYPALISHIRING", 3
		// "AB", 1
		String res = new Solution().convert("PAYPALISHIRING", 3);
		System.out.println(res);
	}
}
