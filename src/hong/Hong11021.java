package hong;

import java.util.Scanner;

public class Hong11021 {
	public Hong11021() {}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		
		for(int i = 1; i <= caseNum; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println("Case #" + i + ": " + (n1 + n2));
		}
		sc.close();
	}
}
