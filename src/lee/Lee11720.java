package lee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lee11720 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum = 0;
		
		String[] nums = br.readLine().split("");
		
		for (int i = 0; i < nums.length; i++) {
			sum += Integer.parseInt(nums[i]);
		}
		System.out.println(sum);
	}
}
