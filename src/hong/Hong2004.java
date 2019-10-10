package hong;

/*
조합 0의 개수
nCm의 끝자리 0의 개수를 출력하는 프로그램을 작성하시오.
첫째 줄에 정수 n, m(0≤m≤n≤2,000,000,000, n!=0)이 들어온다.
첫째 줄에 0의 개수를 출력한다.
25 12 => 2
=======================
nCm = n!/((n-m)!*m!)
2, 5 개수 구할때, 한번씩 나눌때마다 2~n까지 모든 숫자에서
해당 수들이 떨어져나온다고 생각하면 됨.
*
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong2004 {
	public static int cntTwo = 0;
	public static int cntFive = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long res = getZero(n, m);
		
		System.out.println(res);
		
		br.close();
	}
	
	public static int getZero(int n, int m) {
		if(m == 0) {
			return 0;
		}
		cntTwo += countTwo(n);
		cntFive += countFive(n);
		
		cntTwo -= countTwo(m);
		cntFive -= countFive(m);

		cntTwo -= countTwo(n - m);
		cntFive -= countFive(n - m);
		
		return Math.min(cntTwo, cntFive);
	}
	
	public static int countTwo(int n) {
		int count = 0;
		for (int i = 2; i / n <= 1; i *= 2) {
			count += n / i;
		}
		return count;
	}
	
	public static int countFive(int n) {
		int count = 0;
		for (int i = 5; i / n <= 1; i *= 5) {
			count += n / i;
		}
		return count;
	}
}
