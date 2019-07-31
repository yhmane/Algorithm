package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Hwang1406 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		String input = br.readLine();
		int N = Integer.parseInt(br.readLine());
		
		int len = input.length();
		for(int i = 0; i < len; i++) left.push(input.charAt(i));
		
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			
			switch(cmd) {
			case "L":
				if(!left.empty()) right.push(left.pop());
				break;
			case "D":
				if(!right.empty()) left.push(right.pop());
				break;
			case "B":
				if(!left.empty()) left.pop();
				break;
			case "P":
				left.push(st.nextToken().charAt(0));
				break;
			}
		}
		
		while (!left.empty()) {
			right.push(left.pop());
		}

		StringBuilder sb = new StringBuilder();
		while (!right.empty()) {
			sb.append(right.pop());
		}

		System.out.println(sb);
	}
}