package ju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ju8393 {

	public Ju8393() {
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String b[] = br.readLine().split(" ");
		int min = 1000000;
		int max = -1000000;
		for (int i = 0; i < a; i++) {
			int temp = Integer.parseInt(b[i]);
			if(temp < min) {
				min = temp;
			}
			if(temp > max) {
				max = temp;
			}
		}
		System.out.println(min + " " + max);

	}

}
