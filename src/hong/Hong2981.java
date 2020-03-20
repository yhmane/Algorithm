package hong;
/*
검문
트럭을 타고 이동하던 상근이는 경찰의 검문을 받게 되었다. 경찰은 상근이가 운반하던 화물을 하나하나 모두 확인할 것이기 때문에, 검문하는데 엄청나게 오랜 시간이 걸린다.
상근이는 시간을 때우기 위해서 수학 게임을 하기로 했다.
먼저 근처에 보이는 숫자 N개를 종이에 적는다. 그 다음, 종이에 적은 수를 M으로 나누었을 때, 나머지가 모두 같게 되는 M을 모두 찾으려고 한다. M은 1보다 커야 한다.
N개의 수가 주어졌을 때, 가능한 M을 모두 찾는 프로그램을 작성하시오.
첫째 줄에 종이에 적은 수의 개수 N이 주어진다. (2 ≤ N ≤ 100)
다음 줄부터 N개 줄에는 종이에 적은 수가 하나씩 주어진다. 이 수는 모두 1보다 크거나 같고, 1,000,000,000보다 작거나 같은 자연수이다. 같은 수가 두 번 이상 주어지지 않는다.
항상 M이 하나 이상 존재하는 경우만 입력으로 주어진다.
첫째 줄에 가능한 M을 공백으로 구분하여 모두 출력한다. 이때, M은 증가하는 순서이어야 한다.
3
6
34
38 => 2 4
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hong2981 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int maxDiff = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for (int i = 1; i < N; i++) {
			int diff = arr[i - 1] < arr[i] ? arr[i] - arr[i - 1] : arr[i - 1] - arr[i];
			if(diff > maxDiff) {
				maxDiff = diff;
			}
		}
		
		ArrayList<Integer> nArr = getDivision(maxDiff);
		Collections.sort(nArr);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nArr.size(); i++) {
			boolean flag = true;
			int deviser = nArr.get(i);
			int prevRes = arr[0] % deviser;
			for (int j = 1; j < N; j++) {
				if (prevRes != arr[j] % deviser) {
					flag = false;
					break;
				}
			}
			if(flag) {
				sb.append(deviser).append(" ");
			}
		}
		
		System.out.println(sb);
	}
	
	static ArrayList<Integer> getDivision(int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i * i <= n; i++) {
			if(i * i == n) {
				arr.add(i);
			} else {
				if(n % i == 0) {
					if(i > 1) {
						arr.add(i);
					}
					arr.add(n / i);
				}
			}
		}
		
		return arr;
	}
}
