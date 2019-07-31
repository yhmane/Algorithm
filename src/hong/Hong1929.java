package hong;

/*
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 * 3 16 => 3
 * 		   5
 *         7
 *         11
 *         13
 *       
 * */

import java.util.Scanner;

public class Hong1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean flag;
		
		for (int i = m; i <= n; i++) {
			flag = true;
			for (int j = 2; j * j <= i; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag && i != 1) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
