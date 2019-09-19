package hong;

/*
2진수 8진수
2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.
첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.
첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.

11001100 => 314
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hong1373 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder inputsb = new StringBuilder(br.readLine());
		StringBuilder outsb = new StringBuilder();
		
		int len = inputsb.length();
		
		if(len % 3 == 1) {
			inputsb.insert(0, "00");
		} else if (len % 3 == 2) {
			inputsb.insert(0, "0");
		}
		
		for (int i = 0; i < len; i+=3) {
			int sum = 0;
			
			sum += (int)(inputsb.charAt(i) - 48) * 4;
			sum += (int)(inputsb.charAt(i + 1) - 48) * 2;
			sum += (int)(inputsb.charAt(i + 2) - 48) * 1;
			
			outsb.append(sum);
		}
		
		System.out.println(outsb);
		
		br.close();
	}
}
