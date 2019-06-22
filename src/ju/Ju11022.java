package ju;

import java.util.Scanner;


public class Ju11022 {

    public Ju11022() {}
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = Integer.parseInt(sc.nextLine());
    	for(int i = 1; i <= t; i ++) {
    		String a = sc.nextLine();
    		String[] b = a.split(" ");
    		System.out.println("Case #" + i + ": " + b[0] + " + " + b[1] + " = " + (Integer.parseInt(b[0]) + Integer.parseInt(b[1])));
    	}
    	sc.close();
	}
    
}



