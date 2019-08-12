package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hwang2331 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		// A의 최댓값 9999 -> 236196 (6자리)
		// 236196에서 제곱근 합 최댓값을 가지는 수는 199999 -> 295245
		// 혹시 모를것을 대비해 런타임 에러를 방지하기 위해 296000으로 잡음
		boolean[] visited = new boolean[296000];
		int[] numArr = new int[296000];
		
		int cnt = 0;
		while(true) {
		
			if(visited[A]) { break; }
			numArr[cnt++] = A;
			visited[A] = true;
			A = squareSum(A, P);
		}
		
		for(int i=1; i< 296000; i++) {
			if(numArr[i] == A) {
				System.out.println(i);
				break;
			}
		}
		
	}
	
	private static int squareSum(int A, int pow) {
		
		int sum = 0;
		while(A > 0) {
			sum += Math.pow(A % 10, pow);
			A /= 10;
		}
		return sum;
	}
}
