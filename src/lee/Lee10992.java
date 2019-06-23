package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lee10992 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 1; i <= num - 1; i++) {
			for (int j = 0; j < num - i; j++) {
				result.append(" ");
			}
			
			result.append("*");
			
			for (int k = 0; k < (i - 1) * 2 - 1; k++) {
				result.append(" ");
			}
			
			if (i != 1) {
				result.append("*");
			}
			result.append("\n");
		}
		
		for (int l = 0; l < 2 * num - 1; l++) {
			result.append("*");
		}
		
		System.out.println(result);
	}
}
