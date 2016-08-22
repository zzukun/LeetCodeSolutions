package N20ValidParentheses;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			
			if( c == '(' || c == '[' || c == '{' ){
				stack.push(c);
			}
			// System.out.println(stack);
			
			if( c == ')' ){
				if(stack.isEmpty())
					return false;
				if(stack.peek() == '(')
					stack.pop();
				else
					return false;
			}
			if( c == ']' ){
				if(stack.isEmpty())
					return false;
				if(stack.peek() == '[')
					stack.pop();
				else
					return false;
			}
			if( c == '}' ){
				if(stack.isEmpty())
					return false;
				if(stack.peek() == '{')
					stack.pop();
				else
					return false;
			}
		}
		
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		boolean ans = new Solution().isValid("([])");
		System.out.println(ans);
	}
}