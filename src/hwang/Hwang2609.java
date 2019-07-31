package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hwang2609 {

	public static void main(String[] args) throws IOException {

		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		int gcd = gcdFunc(num1, num2);
		int lcm = num1 * num2 / gcd;
		
		System.out.print(gcd + "\n" + lcm);
	}
	
	private static int gcdFunc(int x, int y) {
		while(y > 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
}