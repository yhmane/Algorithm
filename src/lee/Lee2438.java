package lee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lee2438 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				result.append("*");
			}
			result.append("\n");
		}
		System.out.println(result);
	}
}
