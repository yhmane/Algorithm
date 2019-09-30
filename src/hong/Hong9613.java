package hong;

/*
GCD 합
양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.
첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있다. 각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1000000을 넘지 않는다.
각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.
3
4 10 20 30 40
3 7 5 12
3 125 15 25
=======================
70
3
35
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong9613 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n + 1];
			for (int j = 1; j <= n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			System.out.println(solve(arr));
		}
		
		br.close();
	}
	
	private static int getGCD(int a, int b) {
		if (b == 0) return a;
		return getGCD(b, a % b);
	}
	
	private static long solve(int[] arr) {
		long sum = 0;
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum += getGCD(Math.max(arr[i], arr[j]), Math.min(arr[i], arr[j]));
			}
		}
		
		return sum;
	}
}
