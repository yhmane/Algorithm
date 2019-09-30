package hong;

/*
8진수 2진수
8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
314 => 11001100
==>> 배열로 만들어서 풀면 효율적임
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String oct = br.readLine();
		int len = oct.length();
		
		for (int i = 1; i <= len; i++) {
			int n = oct.charAt(len - i) - 48;
			
			if(n == 0 && len == 1) {
				System.out.println(0);
				break;
			}
			for (int j = 0; j < 3; j++) {
				if(n == 1) {
					sb.append(1);
					n = 0;
					continue;
				} else if (i == len && n == 0) {
					break;
				}
				
				sb.append(n % 2);
				n = n >> 1;
			}
		}
		
		System.out.println(sb.reverse());
		
		br.close();
	}
}
