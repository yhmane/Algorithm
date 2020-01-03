package hong;
/*
시험 성적
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
시험 성적을 출력한다.
100
============
A
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hong9498 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char res;
		
		if (N >= 90) {
			res = 'A';
		} else if (N >= 80) {
			res = 'B';
		} else if (N >= 70) {
			res = 'C';
		} else if (N >= 60) {
			res = 'D';
		} else {
			res = 'F';
		}
		
		System.out.println(res);
		
		
	}
}
