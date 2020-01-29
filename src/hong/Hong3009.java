package hong;
/*
네 번째 점
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
직사각형의 네 번째 점의 좌표를 출력한다.
30 20
10 10
10 20
=================
30 10

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Hong3009 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		HashMap<Integer, Integer> xMap = new HashMap<>();
		HashMap<Integer, Integer> yMap = new HashMap<>();
		
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		
		xMap.put(x1, 1);
		yMap.put(y1, 1);
		
		int x2 = 0;
		int y2 = 0;
		
		for (int i = 1; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int tempX = Integer.parseInt(st.nextToken());
			int tempY = Integer.parseInt(st.nextToken());
			
			if(tempX != x1) {
				x2 = tempX;
				if(xMap.containsKey(x2)) {
					xMap.put(x2, xMap.get(x2) + 1);
				} else {
					xMap.put(x2, 1);
				}
			} else {
				xMap.put(x1, xMap.get(x1) + 1);
			}
			
			if(tempY != y1) {
				y2 = tempY;
				if(yMap.containsKey(y2)) {
					yMap.put(y2, yMap.get(y2) + 1);
				} else {
					yMap.put(y2, 1);
				}
			} else {
				yMap.put(y1, yMap.get(y1) + 1);
			}
		}
		
		String res = "";
		if(xMap.get(x1) == 1) {
			res += x1 + " ";
		} else {
			res += x2 + " ";
		}
		
		if(yMap.get(y1) == 1) {
			res += y1;
		} else {
			res += y2;
		}
		
		System.out.println(res);
	}
}
