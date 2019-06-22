package ju;

import java.io.IOException;
import java.util.Scanner;

public class Ju2439 {

	public Ju2439() {
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			StringBuffer sb = new StringBuffer();
			String temp = " ";
			for(int j = 1; j <= a; j++) {
				if(j > a - i) {
					temp = "*";
				}
				sb.append(temp);
			}
			System.out.println(sb);
		}
		
		sc.close();
	}

}
