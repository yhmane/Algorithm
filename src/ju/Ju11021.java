package ju;

import java.util.Scanner;


public class Ju11021 {

    public Ju11021() {}
    
    public static void main(String[] args) {
		solution();
	}
    
    public static void solution() {
    	Scanner sc = new Scanner(System.in);
    	int t = Integer.parseInt(sc.nextLine());
    	for(int i = 1; i <= t; i ++) {
    		String a = sc.nextLine();
    		String[] b = a.split(" ");
    		System.out.println("Case #" + i + ": " + (Integer.parseInt(b[0]) + Integer.parseInt(b[1])));
    	}
    	sc.close();
    }
}



