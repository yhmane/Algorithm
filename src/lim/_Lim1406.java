package lim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _Lim1406 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int cursor = sb.length();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			
			switch (cmd) {
				case "L":
					
					if(cursor > 0) {
						cursor--;
					}
				
					break;
				case "D": 	
					
					if(cursor < sb.length()) {
						cursor++;
					}
					
					break;		
				case "B": 
					
					if(cursor > 0) {
						sb.deleteCharAt(--cursor);
					}
					
					break;
				case "P": 
					sb.insert(cursor++, st.nextToken().charAt(0));
					break;
			}
		}

		System.out.println(sb);
	} 
}
