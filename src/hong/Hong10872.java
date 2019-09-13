package hong;
/*
팩토리얼
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
첫째 줄에 N!을 출력한다.
10 => 3628800
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong10872 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		
		System.out.println(fact(A));
		
		br.close();
	}
	
	public static int fact(int a) {
		if (a <= 1) {
			return 1;
		} else{
			return a * fact(a - 1);
		}
	}
}
