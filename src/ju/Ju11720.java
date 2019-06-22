package ju;

import java.util.Scanner;


public class Ju11720 {

    public Ju11720() {}
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = Integer.parseInt(sc.nextLine());
    	int n = 0;
    	String a = sc.nextLine();
    	String[] b = a.split("");
    	for(int i = 0; i < t; i ++) {
    		n = n + Integer.parseInt(b[i]); 
    	}
    	System.out.println(n);
    	sc.close();
	}
    
}



