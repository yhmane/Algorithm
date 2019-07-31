package hong;

/*
 * 팩토리얼 0의 개수
 * N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
 * 10 => 2
 * */

import java.util.Scanner;

public class Hong1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long res = 1;
		int zeroCnt = 0;
		
		for (int i = 1; i <= n; i++) {
			res *= i;
			while(res % 10 == 0) {
				zeroCnt++;
				res /= 10;
			}
			if(res > 10000000) {
				res = res % 10000000;
			}
			System.out.println(res);
		}
		
		System.out.println(zeroCnt);
		
		sc.close();
	}
}
