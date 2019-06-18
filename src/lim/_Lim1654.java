package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _Lim1654 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		@SuppressWarnings("unchecked")
		Queue<Integer>[] elems = new LinkedList[k];
		
		for(int i = 0; i < k; i++) {
			int number = Integer.parseInt(br.readLine());			
			elems[i] = new LinkedList<Integer>();
			
			for(int j = 1; j <= n; j++) {				
				elems[i].add(number / j);
			}		
		}
		
		int[] b = new int[k];
		int maxIdx = 0;
		int c = k;
		int[] d = new int[k];
		
		for(int i = 0; i < k; i++) {
			b[i] = elems[i].poll();
			d[i] = elems[i].peek();
			
			if(d[i] > d[maxIdx]) {
				maxIdx = i;
			}
		}
		
		while(true) {
			if(c == n) {
				break;
			}
			
			b[maxIdx] = elems[maxIdx].poll();
			d[maxIdx] = elems[maxIdx].peek();
			c++;
			
			for(int i = 0; i < k; i++) {				
				if(d[i] > d[maxIdx]) {
					maxIdx = i;
				}
			}
		}
		
		int min = b[0];
		
		for(int i = 1; i < b.length; i++) {
			
			if(b[i] < min) {
				min = b[i];
			}
		}
		
		System.out.println(Arrays.toString(b));	
	}
}
