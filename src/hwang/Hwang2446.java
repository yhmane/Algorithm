package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-21.
 */
public class Hwang2446 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();
        int            n  = Integer.parseInt(br.readLine());

        for(int i=n; i>=1; i--) {

            for(int j=i; j<n; j++) {
              sb.append(" ");
            }

            for(int k=0; k<2*(i-1)+1; k++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        for(int i=1; i<n; i++) {
            for(int j=i; j<n-1; j++) {
                sb.append(" ");
            }

            for(int k=0; k<2*i+1; k++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}