package hong;
/* 
좌표 정렬하기
2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
class Point implements Comparable<Point>{
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public int compareTo(Point o) {
		if (this.x < o.x) {
			return -1;
		} else if (this.x == o.x) {
			if(this.y < o.y) {
				return -1;
			} else if (this.y == o.y) {
				return 0;
			} else {
				return 1;
			}
		} else {
			return 1;
		}
	}
	
}

public class Hong11650 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int caseNum = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		Point[] pointArr = new Point[caseNum];
		
		for (int i = 0; i < caseNum; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			pointArr[i] = new Point(x, y);
		}
		
		Arrays.sort(pointArr);
		for(Point p : pointArr) {
			bw.append(p.x + " " + p.y + "\n");
		}
		
		bw.flush();
		br.close();
	}
}
