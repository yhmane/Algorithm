package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Hwang11005 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		
		int num  = Integer.parseInt(st.nextToken());
		int punc = Integer.parseInt(st.nextToken());


		while(num > 0) {
			int remain = num % punc;
			if(remain < 10) sb.append(remain);
			else sb.append((char) (remain + 55));
			num = (num / punc);
		}

		System.out.println(sb.reverse());
	}
}
