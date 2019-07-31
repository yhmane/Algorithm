package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hwang10430 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder   sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		sb.append((a+b)%c + "\n" );
		sb.append((a%c + b%c)%c + "\n" );
		sb.append((a*b)%c + "\n" );
		sb.append((a%c * b%c)%c + "\n" );
		System.out.println(sb.toString());
	}
}