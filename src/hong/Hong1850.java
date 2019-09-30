package hong;

/*
최대공약수
모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 이때, A와 B의 최대 공약수를 구하는 프로그램을 작성하시오.
예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고, A가 111이고, B가 111111인 경우에는 최대공약수가 111이다.
첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 2^63보다 작은 자연수이다.
첫째 줄에 A와 B의 최대공약수를 출력한다. 정답은 천만 자리를 넘지 않는다.
3 4 > 1
주어지는 개수의 최대공약수가 1로된 숫자의 최대공약수의 자리수와 일치.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong1850 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		if(A > B) {
			printNum(getGCD(A, B));
		} else if (A < B) {
			printNum(getGCD(B, A));
		} else {
			printNum(A);
		}
		
		br.close();
	}
	
	private static long getGCD(long a, long b) {
		if (b == 0) return a;
		return getGCD(b, a % b);
	}
	
	private static void printNum(long n) {
		StringBuilder sb = new StringBuilder();
		while(n-- > 0) {
			sb.append("1");
		}
		System.out.println(sb);
	}
}
