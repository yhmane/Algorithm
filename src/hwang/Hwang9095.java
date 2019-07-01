package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang9095 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();

        int[] dp    = new int[11];
        int   input = Integer.parseInt(br.readLine());
        dp[1]=1; dp[2] =2; dp[3] = 4;

        while(input-->0) {
            int target = Integer.parseInt(br.readLine());
            for(int i=4; i<=target; i++) {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
            sb.append(dp[target]+"\n");
        }

        System.out.print(sb.toString());
    }
}