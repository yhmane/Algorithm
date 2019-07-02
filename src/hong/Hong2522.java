package hong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hong2522 {
	public Hong2522() {}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int caseNum  = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 2 * caseNum - 1; i++) {
			for (int j = 0; j < caseNum; j++) {
				if((j < caseNum - i && i <= caseNum) || (j < i - caseNum && i > caseNum)) {
					sb.append(" ");
				} else {
					sb.append("*");
				}
			}
			sb.append("\n");
		}
		bw.append(sb);
		bw.flush();
		
	}
}
