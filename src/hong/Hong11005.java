package hong;

/*
10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.
첫째 줄에 10진법 수 N을 B진법으로 출력한다.
60466175 36 => ZZZZZ

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char[] arr = {'0', '1', '2', '3', '4',
					  '5', '6', '7', '8', '9',
					  'A', 'B', 'C', 'D', 'E',
					  'F', 'G', 'H', 'I', 'J',
					  'K', 'L', 'M', 'N', 'O',
					  'P', 'Q', 'R', 'S', 'T',
					  'U', 'V', 'W', 'X', 'Y',
					  'Z'};
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		while (A >= B) {
			int res = A % B;
			A = A / B;
			sb.insert(0, arr[res]);
		}
		sb.insert(0, arr[A]);
		
		System.out.println(sb);
		
		br.close();
	}
}
