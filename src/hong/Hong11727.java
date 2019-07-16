package hong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
2*1, 2*2로 2*n의 네모를 채우는 문제. 길이 n을 n-2와 2로 나누어 생각하면 2에서 세로만 있을 경우가 n-1과 중복되므로 * 2 해서 품.
*/
public class Hong11727 {
	public Hong11727() {}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		int[] dpArr = new int[caseNum + 3];
		
		dpArr[1]= 1;
		dpArr[2]= 2;
		
		for (int i = 3; i <= caseNum; i++) {
			dpArr[i] = (dpArr[i - 1] + 2 * dpArr[i - 2]) % 10007;
		}
		
		
		System.out.println(dpArr[caseNum]);
		br.close();
	}
	
}
