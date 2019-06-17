package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//TODO 효율성 문제 해결 필요
public class Lim11057 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] cnt = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		for(int i = 0; i < n - 1; i++) {
			long[] tmp = new long[10];
			
			for(int j = 0; j < 10; j++) {
				for(int k = j; k < 10; k++) {
					tmp[k] += cnt[j];
				}
			}
						
			cnt = tmp;
			
			for(int k = 0; k < 10; k++) {
				cnt[k] %= 10007;
			}
		}
		
		System.out.println(Arrays.stream(cnt).sum() % 10007);
		
	}
}
