package hong;

/* 
가장 긴 바이토닉 부분 수열

수열 S가 어떤 수 Sk를 기준으로 S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 > SN을 만족한다면, 그 수열을 바이토닉 수열이라고 한다.

예를 들어, {10, 20, 30, 25, 20}과 {10, 20, 30, 40}, {50, 40, 25, 10} 은 바이토닉 수열이지만,  {1, 2, 3, 2, 1, 2, 3, 2, 1}과 {10, 20, 30, 40, 20, 30} 은 바이토닉 수열이 아니다.

수열 A가 주어졌을 때, 그 수열의 부분 수열 중 바이토닉 수열이면서 가장 긴 수열의 길이를 구하는 프로그램을 작성하시오.

첫째 줄에 수열 A의 크기 N이 주어지고, 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ N ≤ 1,000, 1 ≤ Ai ≤ 1,000)

첫째 줄에 수열 A의 부분 수열 중에서 가장 긴 바이토닉 수열의 길이를 출력한다.

10
1 5 2 1 4 3 4 5 2 1  => 7

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong11054 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[caseNum];
		
		for (int i = 0; i < caseNum; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] incdp = new int[caseNum];
		int[] decdp = new int[caseNum];
		
		incdp[0] = 1;
		decdp[caseNum - 1] = 1;
		
		for (int i = 1; i < caseNum; i++) {
			incdp[i] = 1;
			for (int j = 0; j < i; j++) {
				if(arr[i] > arr[j] && incdp[i] <= incdp[j]) {
					incdp[i] = incdp[j] + 1;
				}
			}
		}
		
		for (int i = caseNum - 2; i >= 0; i--) {
			decdp[i] = 1;
			for (int j = caseNum - 1; j >= i; j--) {
				if(arr[i] > arr[j] && decdp[i] <= decdp[j]) {
					decdp[i] = decdp[j] + 1;
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < caseNum; i++) {
			max = Math.max(incdp[i] + decdp[i] - 1, max);
		}
		
		System.out.println(max);
		br.close();
	}
}
