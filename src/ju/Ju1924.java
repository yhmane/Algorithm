package ju;

import java.util.Calendar;
import java.util.Scanner;

public class Ju1924 {

	public Ju1924() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] date = sc.nextLine().split(" ");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2007);
		cal.set(Calendar.MONTH, Integer.parseInt(date[0]) - 1);
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(date[1]));

		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println("SUN");
			break;
		case 2:
			System.out.println("MON");
			break;
		case 3:
			System.out.println("TUE");
			break;
		case 4:
			System.out.println("WED");
			break;
		case 5:
			System.out.println("THU");
			break;
		case 6:
			System.out.println("FRI");
			break;
		case 7:
			System.out.println("SAT");
			break;
		}

		sc.close();
	}

}
