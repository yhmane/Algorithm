package hong;

import java.util.Scanner;

public class Hong1000 {
	public Hong1000() {}
	public void soulution() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strarr = str.split(" ");
		sc.close();
		
		System.out.println(Integer.parseInt(strarr[0]) + Integer.parseInt(strarr[1]));
	}
}
