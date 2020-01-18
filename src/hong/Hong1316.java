package hong;
/*
그룹 단어 체커
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
첫째 줄에 그룹 단어의 개수를 출력한다.
3
happy
new
year => 3

4
aba
abab
abcabc
a => 1
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hong1316 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			if(wordCheck(br.readLine())) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	public static boolean wordCheck(String word) {
		boolean res = true;
		int[] arr = new int[26];
		char beforeCh = word.charAt(0);
		arr[beforeCh - 97]++;
		
		for (int i = 1; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (arr[ch - 97] == 0) {
				beforeCh = ch;
			} else if(arr[ch - 97] != 0 && ch != beforeCh) {
				res = false;
				break;
			}
			arr[ch - 97]++;
		}
		
		return res;
	}
}
