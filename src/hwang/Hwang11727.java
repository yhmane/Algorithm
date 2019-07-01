package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang11727 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;

        for(int i=3; i<=input; i++) {
            dp[i] = dp[i-1] + 2*dp[i-2];
            dp[i] = dp[i]%10007;
        }

        System.out.print(dp[input]);
    }
}