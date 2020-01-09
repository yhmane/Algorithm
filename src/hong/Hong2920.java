package hong;
/*
음계
다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
1 2 3 4 5 6 7 8 => ascending
8 7 6 5 4 3 2 1 => descending
8 1 7 2 6 3 5 4 => mixed
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong2920 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int status = 0; //0 = ascending, 1 = descending, 2 = mixed
		String[] statusArr = {"ascending", "descending", "mixed"};
		int[] arr = new int[8];
		
		for (int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(i > 1) {
				if(arr[i] > arr[i - 1]) {
					if(status == 0) {
						status = 0;
					} else {
						status = 2;
						break;
					}
				} else {
					if(status == 0) {
						status = 2;
					} else {
						status = 1;
					}
				}
			} else if(i == 1) {
				if(arr[i] > arr[i - 1]) {
					status = 0;
				} else if(arr[i] < arr[i - 1]) {
					status = 1;
				} else {
					status = 2;
				}
			}
		}
		
		System.out.println(statusArr[status]);
		
	}
}
