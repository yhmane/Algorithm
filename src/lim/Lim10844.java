package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

효율이 너무 안 나와서 다시 풀 예정
public class Lim10844 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] cnt = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		for(int i = 0; i < n - 1; i++) {
			long[] tmp = new long[10];
			tmp[1] += cnt[0];
			
			for(int j = 1; j < 9; j++) {
				tmp[j - 1]+= cnt[j];
				tmp[j + 1]+= cnt[j];
			}
			
			tmp[8]+= cnt[9];
			
			cnt = tmp;
			
			for(int k = 0; k < 10; k++) {
				cnt[k] %= 1_000_000_000;
			}
		}
		
		System.out.println(Arrays.stream(cnt).sum() % 1_000_000_000);
	}
}
