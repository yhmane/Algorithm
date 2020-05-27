package hong;
/*
LCS
LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.
예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.
첫째 줄과 둘째 줄에 두 문자열이 주어진다. 문자열은 알파벳 대문자로만 이루어져 있으며, 최대 1000글자로 이루어져 있다.
첫째 줄에 입력으로 주어진 두 문자열의 LCS의 길이를 출력한다.

ACAYKP
CAPCAK  => 4(ACAK)
str1[n] == str2[k] , [n, k] == [n - 1, k - 1] + 1
str1[n] != str2[k] , [n, k] == max([n - 1, k]m [n, k - 1])
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hong9251 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = "0" + br.readLine();
		String str2 = "0" + br.readLine();
		
		int len1 = str1.length();
		int len2 = str2.length();
		int lcsLength = 0;
		int max = 0;
		
		int[][] table = new int[len1][len2];
		
		for (int i = 1; i < len1; i++) {
			char ch1 = str1.charAt(i);
			max = 0;
			for (int j = 1; j < len2; j++) {
				char ch2 = str2.charAt(j);
				if(ch1 == ch2) {
					max = table[i - 1][j - 1] + 1;
					table[i][j] = max;
				} else {
					table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
				}
			}
			
			if (lcsLength < max) {
				lcsLength = max;
			}
		}
		
		System.out.println(lcsLength);
	}
}
