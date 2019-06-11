package ju;

import java.util.Scanner;


public class Ju1463 {

    public Ju1463() {}
    
    public static int a[];
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int c = sc.nextInt();
    	a = new int[c+1];
    	
    	System.out.println(solution(c));
    	sc.close();
	}
    
    public static int solution(int b) {
    	if(b == 1) {
    		return 0;
    	}
    	if(a[b] > 0) {
    		return a[b];
    	}
    	a[b] = solution(b-1) + 1;
    	if(b%2 == 0) {
    		int temp = solution(b/2) + 1;
    		if(a[b] > temp) {
    			a[b] = temp;
    		}
    	}
    	if(b%3 == 0) {
    		int temp = solution(b/3) + 1;
    		if(a[b] > temp) {
    			a[b] = temp;
    		}
    	}
    	return a[b];
    }
}



