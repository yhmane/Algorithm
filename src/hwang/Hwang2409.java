package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Hwang2409 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int gcdV = gcd(a, b);
		sb.append(gcdV + "\n");
		sb.append(a*b/gcdV + "\n");
	}
	
	private static int gcd(int a, int b) {
		if (b == 0){
			return a;
		}
		return gcd(b, a % b);
	}
}
