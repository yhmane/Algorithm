package hong;

/*
-2진수
-2진법은 부호 없는 2진수로 표현이 된다. 2진법에서는 2^0, 2^1, 2^2, 2^3이 표현 되지만 -2진법에서는 (-2)^0 = 1, (-2)^1 = -2, (-2)^2 = 4, (-2)^3 = -8을 표현한다. 10진수로 1부터 표현하자면 1, 110, 111, 100, 101, 11010, 11011, 11000, 11001 등이다.
10진법의 수를 입력 받아서 -2진수를 출력하는 프로그램을 작성하시오.
첫 줄에 10진법으로 표현된 수 N(-2,000,000,000≤N≤2,000,000,000)이 주어진다.
-2진법 수를 출력한다.
-13 => 110111
나중에 다시 풀어볼것.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong2089 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if (N == 0) {
			System.out.println(0);
		} else {
			solve(N);
			System.out.println();
		}
		
		br.close();
	}
	
	public static void solve(int N) {
		if (N == 0) {
			return;
		}
		
		if (N % 2 == 0) {
			solve(-(N / 2));
			System.out.print(0);
		} else {
			if (N > 0) {
				solve(-(N / 2));
			} else {
				solve((-N + 1) / 2);
			}
			System.out.print(1);
		}
	}
}
