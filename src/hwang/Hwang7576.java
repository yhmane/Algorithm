package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Hwang7576 {

	private static int row, col, ans;
	private static int[][] graph;
	private static Queue<Pair> q;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());

		graph = new int[row + 1][col + 1];
		q = new LinkedList<>();

		boolean complete = true;

		for (int i = 1; i <= row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= col; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
				if (graph[i][j] == 0)
					complete = false;
			}
		}

		ans = 0;
		if (complete) {
			System.out.println(0);
		} else {
			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= col; j++) {
					if (graph[i][j] == 1) {
						// bfs(i,j);
						q.offer(new Pair(i, j));
					}
				}
			}

			bfs();

			complete = true;
			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= col; j++) {
					if (graph[i][j] == 0) {
						complete = false;
						break;
					}
				}
			}
			System.out.println(complete == true ? ans - 1 : -1 );
		}
	}

	private static void bfs() {

		int[] xxxx = { -1, 1, 0, 0 };
		int[] yyyy = { 0, 0, -1, 1 };
		boolean[][] visit = new boolean[row + 1][col + 1];

		while (!q.isEmpty()) {
			Pair cur = q.poll();
			int cx = cur.x;
			int cy = cur.y;
			visit[cx][cy] = true;

			for (int i = 0; i < 4; i++) {
				int nx = cx + xxxx[i];
				int ny = cy + yyyy[i];

				if (nx <= 0 || nx > row || ny <= 0 || ny > col) {
					continue;
				}
				if (graph[nx][ny] != 0 || visit[nx][ny]) {
					continue;
				}

				q.offer(new Pair(nx, ny));
				visit[nx][ny] = true;
				graph[nx][ny] = graph[cx][cy] + 1;
				ans = Math.max(ans, graph[nx][ny]);
			}
		}
	}

	public static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}