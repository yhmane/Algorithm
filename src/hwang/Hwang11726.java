package hwang;

import java.io.*;

public class Hwang11726 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=input; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] = dp[i]%10007;
        }

        System.out.print(dp[input]);
    }
}