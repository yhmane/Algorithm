package lee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lee2446 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int lines = 2 * num - 1;
		
		StringBuilder result = new StringBuilder();
		
		int empty = 0;
		int stars = 0;
		
		for (int i = 0; i < lines; i++) {
			if (i >= num) {
				empty -= 1;
				stars += 2;
			} else {
				empty = i;
				stars = lines - (i * 2);
			}
			
			for (int j = 0; j < empty; j++) {
				result.append(" ");
			}
			
			for (int k = 0; k < stars; k++) {
				result.append("*");
			}
			result.append("\n");
		}
		System.out.println(result);
	}
}
