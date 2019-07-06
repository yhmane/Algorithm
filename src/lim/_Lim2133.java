package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _Lim2133 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if(n % 2 != 0) {
			System.out.println(0);
			return;
		}
		
		int[] cnt = new int[n + 1];
		cnt[2] = 3;
		
		for(int i = 4; i <= n; i += 2) {
		}
	}
}
