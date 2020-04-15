package hong;
/*
소트인사이드
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
2143
========
4321
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hong1427 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[10];
		
		int n = -1;
		
		for (int i = 0; i < 10; i++) {
			n = br.read() - 48;
			if (n < -1) {
 				break;
			} else {
				arr[n]++;
			}
		}
		
		for (int i = 9; i >= 0; i--) {
			for (int j = 0; j < arr[i]; j++) {
				bw.write(i + 48);
			}
		}
		
		bw.close();;
	}
}
