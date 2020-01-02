package hong;
/*
472
385
================
2360
3776
1416
181720
 */

import java.io.*;

public class Hong2588 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println(A * (B % 10));
		System.out.println(A * (B / 10 % 10));
		System.out.println(A * (B / 100 % 10));
		System.out.println(A * B);
		
		
	}
}
