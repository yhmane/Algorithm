package hong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong9095 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());

		for (int i = 0; i < caseNum; i++) {
			int N = Integer.parseInt(br.readLine());
			dp(N);
		}
		
	}
	
	public static void dp(int N) {
		int n1 = 1;
		int n2 = 2;
		int n3 = 4;
		int res = 0;
		
		if(N == 1) {
			System.out.println(n1);
		} else if(N == 2) {
			System.out.println(n2);
		} else if(N == 3) {
			System.out.println(n3);
		} else {
			for (int i = 3; i < N; i++) {
				res = n1 + n2 + n3;
				n1 = n2;
				n2 = n3;
				n3 = res;
			}
			System.out.println(res);
		}
	}
}
