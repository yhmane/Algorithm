package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim11053 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] seq = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		int compV_b = 0;
		int compV_c = seq[0];
		int compV_s = 0;
		int max1 = 1;
		int max2 = 0;
		
		for(int i = 1; i < n; i++) {
			
			if(compV_c < seq[i]) {
				max1++;
				compV_b = compV_c;
				compV_c = seq[i];
			} else if(compV_b < seq[i]) {
				compV_c = seq[i];
			} else if(compV_s < seq[i]) {
				max2++;
				compV_s = seq[i];
			}
			
			if(max1 == max2) {
				compV_c = compV_s;
				compV_s = 0;
				max2 = 0;
			}
		}
		
		System.out.println(max1);
	}
}
