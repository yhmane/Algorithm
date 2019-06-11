package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-11.
 */
public class Hwang2741 {

    static int cnt;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();
        cnt               = Integer.parseInt(br.readLine());

        for(int i=1; i<=cnt; i++) {
            sb.append(i)
                    .append("\n");
        }

        System.out.print(sb.toString());
    }
}
