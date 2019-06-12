package hong;

import java.util.Scanner;

public class Hong10952 {
	public Hong10952() {}
	
	public void solution() {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if(n1 == 0 & n2 == 0) break;
			System.out.println(n1 + n2);
		}
		sc.close();
	}

}
