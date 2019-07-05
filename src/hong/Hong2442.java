package hong;

import java.util.Scanner;

public class Hong2442 {
	public Hong2442() {}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		int caseNum  = sc.nextInt();
		int space = caseNum - 1;
		
		for(int i = 1; i <= caseNum; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < space; j++) {
				sb.append(" ");
			}
			
			int tmpidx = i * 2 - 1;
			
			for(int j = 0; j < tmpidx; j++ ) {
				sb.append("*");
			}
			
			System.out.println(sb.toString());
			space--;
		}
		
	}
}
