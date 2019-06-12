package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-12.
 */
public class Hwang8393 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, tot;

        n   = Integer.parseInt(br.readLine());
        tot = 0;

        for(int i=1; i<=n; i++) {
            tot+=i;
        }

        System.out.println(tot);
    }
}
