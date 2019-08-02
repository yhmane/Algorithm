package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang1373 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stIn = new StringBuilder(br.readLine());
		StringBuilder stOu = new StringBuilder();

		int len   = stIn.length();
		if(len % 3 == 1)      { stIn.insert(0, "00"); }
		else if(len % 3 == 2) { stIn.insert(0, "0"); }
		
		for(int i = 0; i < len; i += 3 ) {
			
			int sum = 0;
			
			sum += ((int) (stIn.charAt(i) - 48)) * 4;
			sum += ((int) (stIn.charAt(i + 1) - 48)) * 2;
			sum += ((int) (stIn.charAt(i + 2) - 48)) * 1;
			
			stOu.append(sum);
		}
		System.out.println(stOu.toString());
	}
}
