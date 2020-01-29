package hong;
/*
직각삼각형
과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
6 8 10
25 52 60
5 12 13
0 0 0
==================
right
wrong
right
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Hong4153 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[3];
				
		while (true) {
			st = new StringTokenizer(br.readLine());
			arr[0] = Integer.parseInt(st.nextToken());
			if(arr[0] == 0) {
				break;
			}
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(arr);
			
			if(arr[0] + arr[1] < arr[2]) {
				sb.append("wrong").append("\n");
				continue;
			}
			
			if(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
				sb.append("right").append("\n");
			} else {
				sb.append("wrong").append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
}
