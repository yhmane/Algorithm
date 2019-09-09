package hong;
/*
문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
첫째 줄부터 N번째 줄까지 문자열이 주어진다. (1 ≤ N ≤ 100) 문자열의 길이는 100을 넘지 않는다.
첫째 줄부터 N번째 줄까지 각각의 문자열에 대해서 소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력한다.
This is String
SPACE    1    SPACE
 S a M p L e I n P u T     
0L1A2S3T4L5I6N7E8

10 2 0 2
0 10 1 8
5 6 0 16
0 8 9 0
*/

import java.util.Scanner;

public class Hong10820 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String tmpStr = sc.nextLine();
			int[] cnt = new int[4];
			for (int i = 0; i < tmpStr.length(); i++) {
				int c = tmpStr.charAt(i);
				if(c >= 'A' && c <= 'Z' ) {
					cnt[1]++;
				} else if(c >= 'a' && c <= 'z') {
					cnt[0]++;
				} else if(c >= '0' && c <= '9') {
					cnt[2]++;
				} else {
					cnt[3]++;
				}
			}
			
			System.out.println(cnt[0] + " " + cnt[1] + " " + cnt[2] + " " + cnt[3]);
		}
		
		sc.close();
	}
}
