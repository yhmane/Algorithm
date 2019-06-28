package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-25.
 */
public class Hwang10992 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        for(int i=0; i<input-1; i++) {
            for(int j=input-1; j>i; j--) {
                sb.append(" ");
            }
            if(i!=0) { sb.append("*");}
            for(int k=1; k<=(i-1)*2+1; k++) {
                sb.append(" ");
            }
            sb.append("*\n");
        }

        for(int l=0; l<2*(input-1)+1; l++) {
            sb.append("*");
        }
        
        System.out.print(sb.toString());
    }
}
