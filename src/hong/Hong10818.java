package hong;

import java.util.Scanner;

public class Hong10818 {
	public Hong10818() {}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		int max = 0;
		int min = 0;
		for (int i = 0; i < caseNum; i++) {
			int tmpcase = sc.nextInt();
			
			if(i == 0) {
				max = tmpcase;
				min = tmpcase;
			}
			
			max = max < tmpcase ? tmpcase : max;
			min = min > tmpcase ? tmpcase : min;
		}
		System.out.println(min + " " + max);
		
		sc.close();
	}
}
