package ju;

import java.util.Scanner;


public class Ju10952 {

    public Ju10952() {}
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()) {
    		String a = sc.nextLine();
    		String[] b = a.split(" ");
    		int result = Integer.parseInt(b[0]) + Integer.parseInt(b[1]);
    		if(result == 0) {
    			break;
    		}
    		System.out.println(result);
    	}
    	sc.close();
		
	}
    
}



