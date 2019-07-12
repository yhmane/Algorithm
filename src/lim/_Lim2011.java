package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _Lim2011 {
	private static long[] fibo = new long[5001];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		if(input.charAt(0) == '0') {
			System.out.println(0);
			return;
		}
		
		int n = input.length();
		int[] arr = new int[n + 1];
		arr[0] = input.charAt(0) - 48;
		
		for(int i = 1, j = 1; i < n; i++) {
			int x = input.charAt(i) - 48;
			
			if(x == 0) {
				if(arr[j - 1] == 1 || arr[j - 1] == 2) {
					arr[j - 1] *= 10; 
				} else {
					System.out.println(0);
					return;
				}
			} else {
				arr[j++] = x;
			}
		}
		
		
		int[] arr2 = new int[n + 1];
		arr2[0] = arr[0];
		
		for(int i = 0, j = 0; arr[i + 1] != 0; i++) {
			
			if((arr[i] == 1 || arr[i] == 2) && arr[i + 1] < 10) {
				arr2[j] = arr2[j] * 10 + arr[i + 1];
			} else {
				arr2[++j] = arr[i + 1];
			}
		}
		
		
		int cnt = 1;
		int i = 0;
		
		while(arr2[i] != 0) {
			if(arr2[i] > 10 && arr2[i] != 20) {
				cnt *= fibonacci(String.valueOf(arr2[i]).length()); 
			}
			
			i++;
		}
		
		System.out.println(cnt % 1000000);
	}
	
	private static long fibonacci(int n) {
		if(fibo[n] != 0) {
			return fibo[n];
		}
		
		if(n == 0 || n == 1) {
			fibo[n] = 1;		
		} else {
			fibo[n] = fibonacci(n - 1) + fibonacci(n - 2);
		}	
		
		return fibo[n];
	}
}
