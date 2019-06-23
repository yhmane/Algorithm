package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lee10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String[] nums = br.readLine().split(" ");
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < count; i++) {
			
			if (i == 0) {
				max = Integer.parseInt(nums[i]);
				min = Integer.parseInt(nums[i]);
				continue;
			}
			
			if (max < Integer.parseInt(nums[i])) {
				max = Integer.parseInt(nums[i]);
			}
			if (min > Integer.parseInt(nums[i])) {
				min = Integer.parseInt(nums[i]);
			}
			
		}
		System.out.println(min + " " + max);
	}
}
