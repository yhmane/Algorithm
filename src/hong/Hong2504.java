package hong;
/*
https://www.acmicpc.net/problem/2504
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Hong2504 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int result = 0;
		if (validate(s)) {
			result= getNumber(s);
		}
		
		System.out.println(result);
	}
	
	public static int getNumber(String target) {
		char start = target.charAt(0);
		int cnt = 1;
		int startIdx = 1;
		
		int result = 0;
		for (int i = 1; i < target.length(); i++) {
			char nowChar = target.charAt(i);
			
			if (cnt == 0) {
				start = nowChar;
				startIdx = i + 1;
			}
			
			
			if (start == '(') {
				if (nowChar == '(') {
					cnt++;
				} else if (nowChar == ')') {
					cnt--;
				}
				
				if (cnt == 0) {
					if (target.charAt(i - 1) == '(') {
						result += 2;
					} else {
						result += 2 * getNumber(target.substring(startIdx, i));
					}
				}
			} else {
				if (nowChar == '[') {
					cnt++;
				} else if (nowChar == ']') {
					cnt--;
				}
				
				if (cnt == 0) {
					if (target.charAt(i - 1) == '[') {
						result += 3;
					} else {
						result += 3 * getNumber(target.substring(startIdx, i));
					}
				}
			}
		}
		
		return result;
	}
	
	public static boolean validate(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char nowChar = s.charAt(i);
			if (nowChar == '(' || nowChar == '[') {
				stack.push(nowChar);
			} else {
				if (!stack.isEmpty()) {
					if (nowChar == ')' && stack.peek() == '(') {
						stack.pop();
					} else if (nowChar == ']' && stack.peek() == '[') {
						stack.pop();
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		
		if (!stack.isEmpty()) {
			return false;
		}
		
		return true;
	}
}
