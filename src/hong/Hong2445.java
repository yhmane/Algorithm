package hong;

import java.util.Scanner;

public class Hong2445 {
	public Hong2445() {}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum  = sc.nextInt();
		char[] charArr = new char[2 * caseNum];
		int left = -1;
		int right = charArr.length;
		
		for(int i = 0; i < charArr.length; i++) {
			charArr[i] = ' ';
		}
		
		for (int i = 0; i < 2 * caseNum - 1; i++) {
			if(i > caseNum - 1) {
				charArr[left] = ' ';
				charArr[right] = ' ';
				left--;
				right++;
				
			} else {
				left++;
				right--;
				charArr[left] = '*';
				charArr[right] = '*';
			}
			
			System.out.println(String.valueOf(charArr));
		}
	}
}
