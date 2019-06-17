package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Lim11650 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Point> list = new LinkedList<Point>();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < n; i++) {
			String[] points = br.readLine().split(" ");
			Point p = new Point(Integer.parseInt(points[0]), Integer.parseInt(points[1]));
			list.add(p);
		}
		
		list.sort(Comparator.naturalOrder());
		
		for(Point p : list) {
			sb.append(p + "\n");
		}
		
		System.out.println(sb);
	}
	
	static class Point implements Comparable<Point> {
		private int x;
		private int y;
	
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Point o) {
			if(x == o.x) {
				return y - o.y;
			}
			
			return x - o.x;
		}

		@Override
		public String toString() {
			return x + " " + y;
		}
	}
}
