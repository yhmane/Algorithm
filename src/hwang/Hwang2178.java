package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Hwang2178 {

	private static int row, col;
	private static int[][] graph;
	private static Queue<Node> queue = new LinkedList<>();

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

		queue.offer(new Node(0, 0));
		int xxxx[] = { -1, 1, 0, 0 };
		int yyyy[] = { 0, 0, 1, -1 };

		while (!queue.isEmpty()) {
			int x = queue.peek().getX();
			int y = queue.peek().getY();
			queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = x + xxxx[i];
				int ny = y + yyyy[i];

				if (0 <= nx && nx < row && 0 <= ny && ny < col) {
					if (graph[nx][ny] == 1) {
						graph[nx][ny] = graph[x][y] + 1;
						queue.offer(new Node(nx, ny));
					}
				}
			}
		}
		System.out.println(graph[row - 1][col - 1]);
	}
}
