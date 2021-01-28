package hong;
/*
https://www.acmicpc.net/problem/17298
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Hong17298 {
	static int[] arr;
	static int[] ans;
	static StringBuilder sb = new StringBuilder();
	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[N];
		ans = new int[N];
		Arrays.fill(ans, -1);
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		solution();
	}
	
	public static void solution() {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(0);
		for (int i = 1; i < N; i++) {
			if (stack.isEmpty()) {
				stack.push(i);
			} else {
				int idx = stack.peek();
				if (arr[idx] >= arr[i]) {
					stack.push(i);
				} else {
					ans[idx] = arr[i];
					stack.pop();
					i--;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			sb.append(ans[i] + " ");
		}
		
		System.out.println(sb);
	}
}
