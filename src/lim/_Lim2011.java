package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _Lim2011 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] numbers = new int[input.length() + 2];
		numbers[1] = input.charAt(0) - 48;
		
		if(numbers[1] == 0) {
			System.out.println(0);
			return;
		}
		
		for(int i = 2; i <= input.length(); i++) {
			numbers[i] = input.charAt(i - 1) - 48;
		}
		
		int cnt = 1;
		int compV = 1;
		
		for(int i = 1; i <= input.length(); i++) {
			switch (numbers[i]) {
			case 0:
				if(numbers[i - 1] != 1 && numbers[i - 1] != 2) {
					System.out.println(0);
					return;
				}
				break;
			case 1:
				if(numbers[i + 1] != 0) {
					if(numbers[i - 1] == 1 || numbers[i - 1] == 2) {
						cnt += compV;
						compV *= 2;
					} else {
						compV = cnt;
						cnt *= 2;
					}
				}
				
				break;
			case 2:	
				if(numbers[i + 1] >= 1 && numbers[i + 1] <= 6) {
					if(numbers[i - 1] == 1 || numbers[i - 1] == 2) {
						cnt += compV;
						compV *= 2;
					} else {
						compV = cnt;
						cnt *= 2;
					}
				} 
				break;					
			}
		}
		
		System.out.println(cnt);
	}
}
