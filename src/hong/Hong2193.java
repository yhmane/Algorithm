package hong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong2193 {
	public Hong2193() {}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());
		long dp = 1;
		long dp2 = 1;
		long tmp = 0;
		
		for (int i = 1; i <= caseNum; i++) {
			if(i == 1 || i == 2) {
				tmp = 1;
			} else {
				tmp = dp + dp2;
				dp = dp2;
				dp2 = tmp;
			}
		}
		System.out.println(tmp);
		br.close();
	}
}
