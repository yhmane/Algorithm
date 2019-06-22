package lee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lee1924 {

	public static void main(String[] args) throws IOException {
		int[] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split(" ");

		int month = Integer.parseInt(nums[0]);
		int day = Integer.parseInt(nums[1]);
		int n = 0;
		
		for (int i = 0; i < month - 1; i++) {
			n += lastDay[i];
		}
		
		n += day;
		
		System.out.println(week[n % 7]);
	}
}
