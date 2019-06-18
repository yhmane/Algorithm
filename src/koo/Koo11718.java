package koo;

import java.util.Scanner;

public class Koo11718 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		
		while(a<100) {
			if(sc.hasNextLine()) {
				String input = sc.nextLine();
				System.out.println(input);
				a++;
			}else {
				break;
			}			
		}
	}
}
