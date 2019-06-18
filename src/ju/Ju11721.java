package ju;

import java.util.Scanner;


public class Ju11721 {

    public Ju11721() {}
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String a = sc.nextLine();
    	int len = a.length();
    	for(int i = 0; i < len/10; i++) {
    		System.out.println(a.substring(i * 10, (i+1)*10));
    	}
    	System.out.println(a.substring(len - len%10));
    	sc.close();
	}
    
}



