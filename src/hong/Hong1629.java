package hong;
/*
곱셈 
자연수 A를 B번 곱한 수를 알고 싶다. 단 구하려는 수가 매우 커질 수 있으므로 이를 C로 나눈 나머지를 구하는 프로그램을 작성하시오.
첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 모두 2,147,483,647 이하의 자연수이다.
첫째 줄에 A를 B번 곱한 수를 C로 나눈 나머지를 출력한다.
10 11 12
=======
4
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong1629 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		long res = 1;
		long multiply = A % C;
		
		while (B > 0) {
			if (B % 2 == 1) {
				res = (res * multiply) % C;
			}
			multiply = ((multiply % C) * (multiply % C)) % C;
			B /= 2;
		}
		
		System.out.println(res);
	}
}
