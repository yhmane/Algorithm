package hong;
/*
베르트랑 공준
베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 
입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)
입력의 마지막에는 0이 주어진다.
각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
1
10
13
100
1000
10000
100000
0
===================

1
4
3
21
135
1033
8392
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hong4948 {
	static boolean[] isNotPrime;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		isNotPrime = new boolean[123456 * 2 + 1];
		int[] cntArr = new int[123456 * 2 + 1];
		isNotPrime[0] = isNotPrime[1] = true;
		
		for(int i = 2; i <= 123456 * 2; i++) {
			if(!isNotPrime[i]) {
				cntArr[i]++;
				for (int j = i + i; j <= 123456 * 2; j += i) {
					isNotPrime[j] = true;
				}
			}
		}
		
		for(int i = 2; i <= 123456 * 2; i++) {
			cntArr[i] += cntArr[i - 1];
		}
		
		int N;
		while ((N = Integer.parseInt(br.readLine())) != 0) {
			sb.append(cntArr[2 * N] - cntArr[N]).append("\n");
		}
		System.out.println(sb);
	}
}
