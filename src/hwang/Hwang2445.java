package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-17.
 */
public class Hwang2445 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();
        int            n  = Integer.parseInt(br.readLine());

        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++) {
                sb.append("*");
            }
            for(int k=2*i; k<n*2; k++) {
                sb.append(" ");
            }
            for(int j=0; j<i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for(int i=0;i<n*2; i++) {
            sb.append("*");
        }
        sb.append("\n");


        for(int i = 1; i<n; i++) {
            for(int j=1; j<=n-i; j++) {
                sb.append("*");
            }

            for(int k=1; k<=i*2; k++) {
                sb.append(" ");
            }
            for(int j=1; j<=n-i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}