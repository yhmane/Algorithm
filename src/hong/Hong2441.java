package hong;

import java.util.Scanner;

public class Hong2441 {
	public Hong2441() {}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum  = sc.nextInt();
		StringBuilder resStr = new StringBuilder();
		
		for (int i = 0; i < caseNum; i++) {
			resStr.append("*");
		}
		
		for (int i = caseNum; i > 0; i--) {
			System.out.printf("%"+ caseNum +"s\n", resStr.toString().substring(caseNum - i));
		}
	}
}
