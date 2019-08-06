package lim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _Lim11653 {
	private static int testLimit = 3162;
	private static int[] primeNumbers = new int[446];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		getPrimeNumbers();
		
				
	}
	
	private static void getPrimeNumbers() {
		int idx = 0;
		primeNumbers[idx++] = 2;
		
		for(int i = 3; i <= testLimit; i++) {			
			boolean prime = checkIfPrime(i);
			
			if(prime) {
				primeNumbers[idx++] = i;
			}
		}			
	}

	private static boolean checkIfPrime(int i) {
		boolean prime = true;
		int j = 0;
		
		while(primeNumbers[j] != 0) {
			
			if(i < primeNumbers[j] * primeNumbers[j]) {
				break;
			}
			
			if(i % primeNumbers[j] == 0) {
				prime = false;
				break;
			}
			
			j++;
		}
		
		return prime;
	}
}
