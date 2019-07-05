package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _Lim2225 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		long[] cnt = new long[n + 1];
		cnt[n] = 1;
		
		for(int i = 1; i < k; i++) {
		
			long[] tmp = new long[n + 1];
			
			for(int j = 0; j <= n; j++) {
				
				for(int h = j; h <= n; h++) {
					tmp[j] += cnt[h];
				}
				
				tmp[j] %= 1_000_000_000;
			}
			
			cnt = tmp;
		}
		
		System.out.println(Arrays.stream(cnt).sum());
	}
}
