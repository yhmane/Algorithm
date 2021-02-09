package hong;
/*
https://www.acmicpc.net/problem/10799
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Hong10799 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sample = br.readLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		int result = 0;
		
		for (int i = 0; i < sample.length(); i++) {
			char nowChar = sample.charAt(i);
			
			if (nowChar == '(') {
				stack.push(nowChar);
			} else {
				stack.pop();
				
				if (sample.charAt(i - 1) == ')') {
					result++;
				} else {
					result += stack.size();
				}
			}
		}
		
		System.out.println(result);
	}
}
