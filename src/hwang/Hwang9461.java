package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hwang-yunho on 2019-07-15
 * @project Algorithm
 */
public class Hwang9461 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[101];

        for (int i = 1; i <= 3; i++) {
            dp[i] = 1;
        }

        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }


        for(int i = 0; i < N; i++) {
            int t = Integer.parseInt(br.readLine());
            System.out.println(dp[t]);
        }
    }
}
