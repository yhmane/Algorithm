package hong;
/*
무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
1/1	1/2	1/3	1/4	1/5	…
2/1	2/2	2/3	2/4	…	…
3/1	3/2	3/3	…	…	…
4/1	4/2	…	…	…	…
5/1	…	…	…	…	…
…	…	…	…	…	…
이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
첫째 줄에 분수를 출력한다.
14 => 2/4
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hong1193 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int line = 1;
		while(true) {
			if(N > line * (line + 1) / 2) {
				line++;
			} else {
				break;
			}
		}
		
		int sum = line + 1;
		int startNum = (line - 1) * (line) / 2;
		int x, y;
		if(line % 2 == 0) {
			x = N - startNum;
			y = sum - (N - startNum);
		} else {
			x = sum - (N - startNum);
			y = N - startNum;
		}
		System.out.println(x + "/" + y);
		
	}
}
