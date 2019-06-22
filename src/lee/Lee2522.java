package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lee2522 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int lines = 2 * num - 1;
		
		StringBuilder result = new StringBuilder();
		
		int empty = 0;
		int stars = 0;
		
		for (int i = 1; i <= lines; i++) {
			if (i <= num) {
				stars = i;
				empty = num - stars;
			} else {
				stars -= 1;
				empty += 1;
			}
			for (int e = 0; e < empty; e++) {
				result.append(" ");
			}
			for (int s = 0; s < stars; s++) {
				result.append("*");
			}
			result.append("\n");
		}
		System.out.println(result);
	}
}
