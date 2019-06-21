package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lim1107 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String goalCh = br.readLine();
		int n = Integer.parseInt(goalCh);
		int m = Integer.parseInt(goalCh);
		boolean[] brokenKey = new boolean[10];
		int curChannel = 100;
		int answer;
		
		if(m > 0) {
			StringTokenizer st = new StringTokenizer(goalCh);
			
			for(int i = 0; i < m; i++) {
				brokenKey[Integer.parseInt(st.nextToken())] = true;
			}
		}
		
		int gap = Math.abs(n - curChannel);	
		int noLength = goalCh.length();
		
		if(gap <= noLength) {
			answer = gap;
		} else {
			StringBuffer upper = new StringBuffer();
			
			for(int i = 0; i < noLength; i++) {
//				int k = 
			}
		}
	}
}
