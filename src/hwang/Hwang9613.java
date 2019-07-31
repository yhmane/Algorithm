package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hwang9613 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder  sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			int[] arr = new int[cnt];
			for(int i = 0; i < cnt; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			long tot = 0l;
			for(int i = 0; i < cnt-1; i++) {
				for(int j = i + 1; j <cnt; j++) {
					tot += gcd(arr[i], arr[j]);
				}
			}
			sb.append(tot + "\n");
		}
		System.out.println(sb.toString());
	}
	
	private static int gcd(int x, int y) {
		while(y > 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
}
