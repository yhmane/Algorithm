package hong;
/*
직사각형에서 탈출
한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
첫째 줄에 x y w h가 주어진다. w와 h는 1,000보다 작거나 같은 자연수이고, x는 1보다 크거나 같고, w-1보다 작거나 같은 자연수이고, y는 1보다 크거나 같고, h-1보다 작거나 같은 자연수이다.
첫째 줄에 문제의 정답을 출력한다.
6 2 10 3 => 1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hong1085 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int dx = 0;
		int dy = 0;
		
		if(((float)x / w) < 0.5) {
			dx = x;
		} else {
			dx = w - x;
		}
		
		if(((float)y / h) < 0.5) {
			dy = y;
		} else {
			dy = h - y;
		}
		
		if(dx > dy) {
			System.out.println(dy);
		} else {
			System.out.println(dx);
		}
	}
}
