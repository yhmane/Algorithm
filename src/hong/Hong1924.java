package hong;

import java.util.Scanner;

public class Hong1924 {
	public Hong1924() {}
//	public void solution() {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//                1   2  3   4   5   6   7   8   9   10  11  12
		int[] calDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		int daysCnt = 0;
		
		for (int i = 0; i < month - 1; i++) {
			daysCnt += calDays[i];
		}
		
		daysCnt += day;
		
		System.out.println(weeks[daysCnt % 7]);
		
		sc.close();
	}
}
