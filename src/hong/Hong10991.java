package hong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hong10991 {
	public Hong10991() {}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int caseNum = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= caseNum; i++) {
			for (int j = 1; j <= caseNum + i - 1; j++) {
				if(j % 2 == ((caseNum - i + 1) % 2 == 0 ? 1 : 0) || j < caseNum + 1 - i) {
					bw.write(" ");
				} else {
					bw.write("*");
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
	}

}
