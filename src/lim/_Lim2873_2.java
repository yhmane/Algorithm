package lim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim2873_2 {
	private static int minI = 0;
	private static int minJ = 1;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		String answer = null;
		
		if(r % 2 == 1) {
			skipReadLine(br, r);			
			answer = makeSimpleAnswer(r, c, 'R', 'L', 'D');
		} else if(c % 2 == 1) {
			skipReadLine(br, r);
			answer = makeSimpleAnswer(c, r, 'D', 'U', 'R');
		} else {		
			getMinScoreSpot(br, r, c);
		}
		
		System.out.println(answer);
	}

	private static void getMinScoreSpot(BufferedReader br, int r, int c) throws IOException {
		StringTokenizer st;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < c; j++) {
				int score = Integer.parseInt(st.nextToken());
				
				if((i + j) % 2 == 1 && min > score) {
					min = score;
					minI = i;
					minJ = j;
				}
			}
		}
	}

	private static void skipReadLine(BufferedReader br, int r) throws IOException {
		for(int i = 0; i < r; i++) {
			br.readLine();
		}
	}

	private static String makeSimpleAnswer(int r, int c, char d1, char d2, char p) {
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < r; i++) {
			char direction;
			
			if(i % 2 == 0) {
				direction = d1;
			} else {
				direction = d2;
			}
			
			for(int j = 0; j < c - 1; j++) {
				sb.append(direction);
			}
			
			sb.append(p);
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		return sb.toString();
	}
}
