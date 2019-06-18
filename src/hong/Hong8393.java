package hong;

import java.util.Scanner;

public class Hong8393 {
	public Hong8393() {}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		
		int tmpNum = sc.nextInt();
		
		System.out.println(tmpNum * (tmpNum + 1) / 2);
		
		sc.close();
	}
}
