package hong;
/*
세 수
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
두 번째로 큰 정수를 출력한다.
20 30 10 => 20
30 30 10 => 30
40 40 40 => 40
20 10 10 => 10

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong10817 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());
		
		boolean flag = true;
		
		while(flag) {
			int temp = 0;
			if(arr[0] > arr[1]) {
				temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
				continue;
			}
			
			if (arr[1] > arr[2]) {
				temp = arr[1];
				arr[1] = arr[2];
				arr[2] = temp;
				continue;
			}
			
			flag = false;
		}
		
		System.out.println(arr[1]);
		
	}
}
