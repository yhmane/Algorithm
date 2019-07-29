package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Hwang10799 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input  = br.readLine();
		int    len    = input.length();
		int    result = 0;

		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < len; i++) {
			char value = input.charAt(i);
			if(value == '(') stack.push(value);
			else {
				stack.pop();
				// 레이저
				if(input.charAt(i-1) == '(') result += stack.size();
				// 파이프 끝
				else result++;
			}
		}

		System.out.println(result);
	}
}
