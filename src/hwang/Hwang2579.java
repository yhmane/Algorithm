package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hwang-yunho on 2019-07-14
 * @project Algorithm
 */
public class Hwang2579 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[][] dp = new int[N][2];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 0은 한번에 1칸
        // 1은 한번에 2칸
        dp[0][0] = arr[0];
        dp[1][0] = dp[0][0] + arr[1];
        dp[1][1] = arr[1];

        for(int i=2; i<N; i++){
            dp[i][0] = dp[i-1][1] + arr[i];
            dp[i][1] = Math.max(dp[i-2][0], dp[i-2][1])+arr[i];
        }
        System.out.println(Math.max(dp[N-1][0], dp[N-1][1]));

    }
}