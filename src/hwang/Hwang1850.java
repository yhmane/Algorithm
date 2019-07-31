package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hwang1850 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long t = gcd(a, b);

		for(long i = 0l; i < t; i++ ) {
			sb.append("1");
		}

		System.out.println(sb.toString());
	}
	
	private static long gcd(long x, long y) {
		while(y > 0) {
			long temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
}
