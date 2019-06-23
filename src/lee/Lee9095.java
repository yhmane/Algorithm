package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lee9095 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int n = 0;
		
		int[] arr = new int[11];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for (int i = 0; i < T; i++) {
			n = Integer.parseInt(br.readLine());
			
			for (int j = 4; j <= n; j++) {
				arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
			}
			System.out.println(arr[n]);
		}
	}
}
