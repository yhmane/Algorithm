package lim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class _Lim1406 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int n = Integer.parseInt(br.readLine());		
		int cursor = str.length();
		
		List<Character> list = new LinkedList<Character>();
		
		for(char x : str.toCharArray()) {
			list.add(x);
		}
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			
			switch (cmd) {
			case "L":
				
				if(cursor > 0) {
					cursor--;
				}
				
				break;
			case "D": {
				
				if(cursor < list.size()) {
					cursor++;
				}
				
				break;
			}
			case "B": {
				
				if(cursor > 0) {
					list.remove(--cursor);
				}
				
				break;
			}
			case "P": {
				list.add(cursor++, st.nextToken().charAt(0));
				break;
			}
			default:
				break;
			}
		}
		
		for(char e : list) {
			bw.write(e);
		}
		
		bw.flush();
	} 
}
