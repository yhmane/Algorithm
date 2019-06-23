package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lee10991 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num - i; j++) {
				result.append(" ");
			}
			for (int k = 0; k < i; k++) {
				result.append("* ");
			}
			result.append("\n");
		}
		System.out.println(result);
	}
}