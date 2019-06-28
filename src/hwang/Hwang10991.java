package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-25.
 */
public class Hwang10991 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());

        for(int i=0; i<input; i++) {
            for(int j=input-1; j>i; j--) {
                sb.append(" ");
            }
            for(int k=0; k<=i; k++) {
                sb.append("* ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
