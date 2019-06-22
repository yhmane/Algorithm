package hong;

import java.util.Scanner;

public class Hong11721 {
	public Hong11721() {}
	public void solution() {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		int idx = arr.length / 10 + 1;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < idx; i++) {
			int startidx = i * 10;
			int endidx = (i + 1) * 10 > arr.length ? arr.length : (i + 1) * 10;
			sb.append(str.substring(startidx, endidx));
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		
		sc.close();
	}
}
