package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lim10816 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] cards = new int[20_000_001];
		
		for(int i = 0; i < N; i++) {
			cards[Integer.parseInt(st.nextToken()) + 10_000_000]++;
		}
				
		final int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < M; i++) {					
			sb.append(cards[Integer.parseInt(st.nextToken()) + 10_000_000] + " ");
		}
		
		System.out.println(sb);
	}
}
