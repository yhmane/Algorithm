package hong;

import java.util.Scanner;

public class Hong2440 {
	public Hong2440() {}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int caseNum  = sc.nextInt();
		StringBuilder resStr = new StringBuilder();
		
		for (int i = 0; i < caseNum; i++) {
			resStr.append("*");
		}
		
		for (int i = caseNum; i > 0; i--) {
			System.out.println(resStr.toString().substring(caseNum - i));
		}
	}
}
