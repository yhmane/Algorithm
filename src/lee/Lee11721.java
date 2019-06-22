package lee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lee11721 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		StringBuffer result = new StringBuffer();
		int i = 0;
		
		while(i < input.length()) {
			int len = i + 10 < input.length() ? i + 10 : input.length();
			result.append(input.substring(i, len) + "\n");
			i += 10;
			System.out.println("inner: " + i);
		}
		System.out.println(result);
	}
}
