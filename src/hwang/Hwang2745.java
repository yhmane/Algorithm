package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hwang2745 {

	public static void main(String[] args) throws IOException {

		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String input = st.nextToken();
		int    punc  = Integer.parseInt(st.nextToken());
		int    len   = input.length();
		int    total = 0;

		for(int i = 0; i < len; i++) {

			char stringIndex = input.charAt(i);
			int  order       = len - i - 1;
			int  num;

			if(stringIndex >= 65) { num = stringIndex - 55; }
			else                  { num = (int) stringIndex - 48; }

			total += num * squareValue(order, punc); 
		}
		System.out.println(total);
	}
	
	private static int squareValue(int order, int punc) {

		int temp = 1;
		while(order-- > 0) {
			temp = temp * punc;
		}
		return temp == 0 ? 1 : temp;
	}
}