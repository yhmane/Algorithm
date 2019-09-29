package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim1806 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		int[] seq = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			
			int sum = 0;
			
			for(int j = i; j < n; j++) {
				sum += seq[j];
				
				if(sum >= s) {
					int cnt = j - i + 1;
					
					if(answer == 0 || cnt < answer) {
						answer = cnt;
						break;
					}
				}
			}
		}
		
		System.out.println(answer);
	}
}
