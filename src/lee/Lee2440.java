package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lee2440 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		StringBuffer result = new StringBuffer();
		
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - i ; j++) {
				result.append("*");
			}
			result.append("\n");
		}
		System.out.println(result);
	}
}
