package hong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hong2446 {
	public Hong2446() {}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int caseNum  = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 2 * caseNum - 1; i++) {
			if(i < caseNum) {
				for (int j = 0; j < 2 * caseNum - 1 - i; j++) {
					if(j < i) {
						sb.append(" ");
					} else {
						sb.append("*");
					}
				}
				sb.append("\n");
			} else {
				for (int j = 0; j <= i; j++) {
					if(j < 2 * (caseNum - 1) - i) {
						sb.append(" ");
					} else {
						sb.append("*");
					}
				}
				sb.append("\n");
				
			}
		}
		bw.append(sb);
		bw.flush();
		
	}
}
