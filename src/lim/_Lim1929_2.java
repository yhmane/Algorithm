package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 상위권 문제 시간 효율성 분석 필요. 소수 구할 때 i < el * el 까지만 구해도 되는 이유도 이해가 필요
public class _Lim1929_2 {
	
	private static List<Integer> primeNumbers = new ArrayList<Integer>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		StringBuffer sb = new StringBuffer();
		
		getPrimeNumbers(n);
		
		int i = 0;
		
		while(primeNumbers.get(i) < m) {
			i++;
		}
		
		while(i < primeNumbers.size()) {
			sb.append(primeNumbers.get(i++) + "\n");
		}
		
		System.out.println(sb);
	}

	private static void getPrimeNumbers(int n) {
		primeNumbers.add(2);
		
		for(int i = 3; i <= n; i++) {
			boolean prime = true;
			
			for(int el : primeNumbers) {
				
				if(i < el * el) {
					break;
				}
				
				if(i % el == 0) {
					prime = false;
					break;
				}			
			}
			
			if(prime) {
				primeNumbers.add(i);
			}
		}
	}
}
