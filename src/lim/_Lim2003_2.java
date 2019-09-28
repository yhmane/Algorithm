package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 맞추긴 하였으나 이렇게 풀라고 낸 문제가 아닌듯함. 상위권 문제를 보고 투포인터?를 이용해서 풀어보도록 하자
public class _Lim2003_2 {
	private static int answer = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] seq = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			
			int sum = 0;
			
			for(int j = i; j < n; j++) {
				sum += seq[j];
				
				if(sum == m) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
}
