package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hwang-yunho on 2019-07-14
 * @project Algorithm
 */
public class Hwang2133 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[0] = 1;

        for(int i=2; i<=N; i+=2) {
            dp[i] = dp[i-2]*3;

            // 스페셜 케이스가 존재
            for(int j=4; i-j>=0; j+=2)
                dp[i] += dp[i-j]*2;
        }

        System.out.println(dp[N]);
    }
}
