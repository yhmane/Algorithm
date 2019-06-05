package ju;

import java.util.Scanner;


public class Ju10951 {

    public Ju10951() {}
    public void solution() {
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()) {
    		String a = sc.nextLine();
    		String[] b = a.split(" ");
    		System.out.println(Integer.parseInt(b[0]) + Integer.parseInt(b[1]));
    	}
    	sc.close();
    }
}



