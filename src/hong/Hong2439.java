package hong;

import java.util.Scanner;

public class Hong2439 {
	public Hong2439() {}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int caseNum  = sc.nextInt();
		StringBuilder resStr = new StringBuilder();
		
		for (int i = 1; i <= caseNum; i++) {
			resStr.append("*");
			System.out.printf("%"+ caseNum +"s\n", resStr.toString());
		}
	}
}
