package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang4963 {

	private static int[][] map;
	private static int[][] visited;
	private static int row, col;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		while(!(input = br.readLine()).equals("0 0")) {
			String[] arr = input.split(" ");
			row = Integer.parseInt(arr[0]);
			col = Integer.parseInt(arr[1]);
			map = new int[col][row];
			visited = new int[col][row];
			
			String[] maps;
			for(int i = 0; i < col; i++) {
				maps = br.readLine().split(" ");
				for(int j = 0; j < row; j++) {
					map[i][j] = Integer.parseInt(maps[j]);
				}
			}
			
			int cnt = 0;
			for(int i = 0; i < col; i++) {
				for(int j = 0; j < row; j++) {
					if(visited[i][j] == 0 && map[i][j] == 1 ) {
						dfs(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	private static void dfs(int xNode, int yNode) {
		
		visited[xNode][yNode] = 1;
		int xxxx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
		int yyyy[] = {-1, 0, 1, -1, 1, -1, 0, 1};
		
		for(int i = 0; i < 8; i++) {
			
			int x = xNode + xxxx[i];
			int y = yNode + yyyy[i];
			if(x < 0 || y < 0 || x >= col || y >= row) { continue; }
			if(visited[x][y] == 0 && map[x][y] == 1) { dfs(x, y); }
		}
	}
}
