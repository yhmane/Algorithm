package ju;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Ju2742 {

    public Ju2742() {}
    
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
    	int a = Integer.parseInt(br.readLine());
    	for(int i = a; i >= 1; i--) {
    		bw.write(i + "\n");
    	}
        bw.close();
        br.close();
	}
    
}



