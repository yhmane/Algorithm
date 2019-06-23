package lee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lee11021 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuffer result = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			String[] nums = br.readLine().split(" ");
			result.append("Case #" + (i + 1) + ": " + (Integer.parseInt(nums[0]) + Integer.parseInt(nums[1])) + "\n");
		}
		System.out.println(result);
	}
}
