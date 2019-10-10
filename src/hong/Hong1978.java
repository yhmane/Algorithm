package hong;

/*
소수 찾기
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
주어진 수들 중 소수의 개수를 출력한다.
4
1 3 5 7
================
3
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if(isPrime(Integer.parseInt(st.nextToken())) == 1) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
	
	public static int isPrime(int n) {
		if(n == 1) {
			return 0;
		}
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				return 0;
			}
		}
		
		return 1;
	}
}
