package hong;
/*
단어 공부
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
Mississipi => ?
zZa => Z
z => Z
baaa => A
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hong1157 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cntArr = new int[26];
		
		while(true) {
			int ascii = br.read();
			
			if(ascii == 10 || ascii == 13) {
				break;
			} else {
				char ch = (char)ascii;
				if(ch >= 'a') {
					ch -= 32;
				}
				
				cntArr[ch - 65]++;
			}
		}
		
		int max = -1;
		int maxIdx = -1;
		for (int i = 0; i < cntArr.length; i++) {
			if(cntArr[i] > max) {
				max = cntArr[i];
				maxIdx = i;
			}
		}
		
		boolean duplFlag = false;
		for (int i = 0; i < cntArr.length; i++) {
			if(cntArr[i] == max && i != maxIdx) {
				duplFlag = true;
			}
		}
		
		if(duplFlag) {
			System.out.println("?");
		} else {
			System.out.println((char)(maxIdx + 65));
		}
		
	}
}
