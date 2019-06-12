package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-12.
 */
public class Hwang2439 {

    public static void main(String[] args) throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb  = new StringBuilder();
        int            cnt = Integer.parseInt(br.readLine());

        for(int i=1; i<=cnt; i++) {
            // 공백
            for(int j=cnt-i; j>=1; j--) {
                sb.append(" ");
            }

            for(int k=1; k<=i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
