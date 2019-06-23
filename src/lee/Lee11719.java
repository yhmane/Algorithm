package lee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lee11719 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		StringBuffer result = new StringBuffer();
		
		while ((line = br.readLine()) != null) {
			result.append(line + "\n");
		}
		System.out.println(result);
	}
}
