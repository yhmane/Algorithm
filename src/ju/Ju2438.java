package ju;

import java.io.IOException;
import java.util.Scanner;

public class Ju2438 {

	public Ju2438() {
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			StringBuffer sb = new StringBuffer();
			for(int j = 1; j <= i; j++) {
				sb.append("*");
			}
			System.out.println(sb);
		}
		
		sc.close();
	}

}
