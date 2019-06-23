package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-17.
 */
public class Hwang2442 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();
        int            n  = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            int t = 2*i+1;
            for(int k=i+1; k<n; k++) {
                sb.append(" ");
            }
            for(int j=1; j<=t; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}