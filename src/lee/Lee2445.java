package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lee2445 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int lines = 2 * input - 1;
		
		StringBuffer result = new StringBuffer();
		
		/*
		for (int i = 1; i <= lines; i++) {
			for (int k = 0; k < i; k++) {
				result.append("*");
			}
			for (int j = 0; j < input - i; j++) {
				result.append(" ");
			}
			result.append("\n");
		}
		*/
		System.out.println(result);
	}
}
