package hong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
