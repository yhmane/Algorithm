package hong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong11726 {
	public Hong11726() {}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		int[] dpArr = new int[caseNum + 3];
		// (x, y) = (1, 1), (2, 2), (3, 3), (4, 5), (5, 8)
		
		dpArr[1]= 1;
		dpArr[2]= 2;
		
		for (int i = 3; i <= caseNum; i++) {
			dpArr[i] = dpArr[i - 1] + dpArr[i - 2];
			if(dpArr[i] > 10007) {
				dpArr[i] = dpArr[i] % 10007;
			}
		}
		
		
		System.out.println(dpArr[caseNum] % 10007);
		br.close();
	}
	
}
