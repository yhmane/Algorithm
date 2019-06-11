package hwang;

import java.io.*;

/**
 * Created by hwang-yunho on 2019-06-11.
 */
public class Hwang11720 {

    static int cnt;
    static int tot;
    static String input;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tot   = 0;
        cnt   = Integer.parseInt(br.readLine());
        input = br.readLine();

        for(int i=0; i<cnt; i++) {
            tot += input.charAt(i) - '0';
        }

        System.out.println(tot);
    }
}
