package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-30.
 */
public class Hwang11057 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  n  = Integer.parseInt(br.readLine());
        long[][] dp = new long[1001][10];
        long result = 0l;

        for(int i=0; i<10; i++) {
            dp[1][i] = 1;
        }

        for(int i=2; i<=n; i++) {
            for(int j=0; j<10; j++) {
                for(int k=j; k<10; k++) {
                    dp[i][j] += dp[i-1][k];
                }
                dp[i][j]%=10007;
            }
        }

        for(int i=0; i<10; i++) {
            result += dp[n][i];
        }

        System.out.print(result%=10007);
    }
}