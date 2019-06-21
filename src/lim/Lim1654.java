package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lim1654 {	
	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[] lineArr = new int[k];
		long sum = 0;
		
		for(int i = 0; i < k; i++) {
			lineArr[i] = Integer.parseInt(br.readLine());					
			sum += lineArr[i];
		}
				
		long answer = sum / n;
		long left = 0;
		long right = answer;
				
		while(true) {
			int cnt = 0;
			
			for(int i = 0; i < k; i++) {
				cnt += lineArr[i] / answer;
			}
						
			if(cnt > n) {
				left = answer + 1;
				if(left > right) break;
			} else if(cnt < n) {
				right = answer - 1;
			} else {
				break;
			}
			
			answer = (left + right) / 2;
		}
					
		while(true) {
			int cnt = 0;
			
			answer++;
			
			for(int i = 0; i < k; i++) {
				cnt += lineArr[i] / answer;
			}
			
			if(cnt < n) break;
		}
		
		System.out.println(--answer);		
	}
}
