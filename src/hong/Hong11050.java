package hong;
/*
이항 계수 1
자연수 과 정수 가 주어졌을 때 이항 계수 를 구하는 프로그램을 작성하시오.
첫째 줄에 과 가 주어진다. (1 ≤  ≤ 10, 0 ≤  ≤ )
 를 출력한다.
 5 2 => 10
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong11050 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		long res = 1;
		
		for (int i = N; i > N - K; i--) {
			res *= i;
		}
		
		for (int i = 1; i <= K; i++) {
			res /= i;
		}
		
		System.out.println(res);
	}
}
