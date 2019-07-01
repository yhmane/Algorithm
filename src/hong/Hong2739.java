package hong;

import java.util.Scanner;

public class Hong2739 {
	public Hong2739() {}
	
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", caseNum, i, caseNum*i);
		}
	}
}
