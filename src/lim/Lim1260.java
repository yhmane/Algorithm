package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Lim1260 {
	
	static List<Integer> result;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputs = br.readLine().split(" ");
		int nDot = Integer.parseInt(inputs[0]);
		int nLine = Integer.parseInt(inputs[1]);
		int start = Integer.parseInt(inputs[2]);
		
		int[][] matrix = new int[nDot + 1][nDot + 1];
		
		for(int i = 0; i < nLine; i++) {
			String[] lineInfo = br.readLine().split(" ");
			int x = Integer.parseInt(lineInfo[0]);
			int y = Integer.parseInt(lineInfo[1]);
			
			matrix[x][y] = 1;
			matrix[y][x] = 1;
		}
		
//		for(int i = 0; i < matrix.length; i++) {
//			System.out.println(Arrays.toString(matrix[i]));
//		}
		
		result = new ArrayList<Integer>(nDot);
		dfsMethod(matrix, start);
		
		StringBuffer dfs = new StringBuffer();
		result.forEach(el -> dfs.append(el + " "));
		
		result = new ArrayList<Integer>(nDot);
		result.add(start);
		bfsMethod(matrix, start);
		
		StringBuffer bfs = new StringBuffer();
		result.forEach(el -> bfs.append(el + " "));
		
		System.out.println(dfs.toString().trim());
		System.out.println(bfs.toString().trim());
	}
	
	private static void bfsMethod(int[][] matrix, int start) {

		int[] paths = matrix[start];
		List<Integer> nearNum = new ArrayList<>();
		
		for(int i = 1; i < paths.length; i++) {
			
			if(!result.contains(i) && paths[i] == 1) {
				result.add(i);
				nearNum.add(i);
			}
		}
		
		if(nearNum.size() > 0) {
			for(int e : nearNum) {
				bfsMethod(matrix, e);
			}
		}	
	}

	public static void dfsMethod(int[][] matrix, int start) {
		result.add(start);

		int[] paths = matrix[start];
		
		for(int i = 1; i < paths.length; i++) {
			
			if(!result.contains(i) && paths[i] == 1) {
				dfsMethod(matrix, i);
			}
		}
	}
}
