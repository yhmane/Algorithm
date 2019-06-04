package hong;

import java.util.Scanner;

public class Hong10950 {
	public Hong10950() {}
	
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		
		for(int i = 0; i < caseNum; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println(n1 + n2);
		}
		sc.close();
	}

}
