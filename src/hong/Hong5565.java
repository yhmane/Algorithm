package hong;
/*
https://www.acmicpc.net/problem/5565
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hong5565 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int realSum = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		
		System.out.println(realSum - sum);
	}
}
