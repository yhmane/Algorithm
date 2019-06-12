package ju;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Ju2751 {

    public Ju2751() {}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
		solution();
	}
    
    public static void solution() throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
    	int a = Integer.parseInt(br.readLine());
    	List<Integer> b = new ArrayList<Integer>();
    	for(int i = 0; i < a; i++) {
    		b.add(Integer.parseInt(br.readLine()));
    	}
    	Collections.sort(b);
    	for(int j : b) {
    		bw.write(j + "\n");
    	}
        bw.close();
        br.close();
    }
}



