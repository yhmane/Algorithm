package hong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hong10992 {
	public Hong10992() {}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int caseNum = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= caseNum; i++) {
			for (int j = 1; j <= caseNum + i - 1; j++) {
				if(i == caseNum) {
					bw.write("*");
				} else if (j == caseNum + 1 - i || j == caseNum + i - 1) {
					bw.write("*");
				} else {
					bw.write(" ");
				}
				
			}
			bw.newLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
