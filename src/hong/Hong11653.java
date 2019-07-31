package hong;

/*
 * 소인수분해
 * 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 * 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
 * 72 => 2
 *       2
 *       2
 *       3
 *       3
 *       
 * */

import java.util.Scanner;

public class Hong11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 2; n != 1; i++) {
			while(n % i == 0) {
				System.out.println(i);
				n /= i;
			}
		}
		
		sc.close();
	}
}
