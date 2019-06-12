package hong;

import java.util.Scanner;

public class Hong11720 {
	public Hong11720() {}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		int sum = 0;
		
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		for(int i = 0; i < caseNum; i++) {
			sum += Character.getNumericValue((arr[i]));
		}
		System.out.println(sum);
		
		sc.close();
	}
}
