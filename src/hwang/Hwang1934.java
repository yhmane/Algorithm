package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hwang1934 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder  sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int gcdValue = gcd(num1, num2);
			int lcm = num1 * num2 / gcdValue;
			sb.append(lcm + "\n");
		}
		
		System.out.println(sb.toString());
	}
	
	private static int gcd(int x, int y) {
		
		while(y > 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		
		return x;
	}
}
