package hwang;
import java.io.*;

import java.util.*;

public class Hwang2178 {
	
	private static int graph[][];
	private static Queue<Node> q = new LinkedList<>();
	private static int row, col;

	public static class Node {
		private int x;
		private int y;

		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		
		graph = new int[row][col];
		for (int i = 0; i < row; i++) {
			String input = br.readLine();
			for (int j = 0; j < col; j++) {
				graph[i][j] = input.charAt(j) - '0';
			}
		}
		
		bfs();

	}
	
	private static void bfs() {

		q.offer(new Node(0, 0));
		int xxxx[] = { -1, 1, 0, 0 };
		int yyyy[] = { 0, 0, 1, -1 };

		while (!q.isEmpty()) {
			int x = q.peek().getX();
			int y = q.peek().getY();
			q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = x + xxxx[i];
				int ny = y + yyyy[i];

				if (0 <= nx && nx < row && 0 <= ny && ny < col) {
					if (graph[nx][ny] == 1) {
						graph[nx][ny] = graph[x][y] + 1;
						q.offer(new Node(nx, ny));
					}
				}
			}
		}
		System.out.println(graph[row - 1][col - 1]);
	}
}
