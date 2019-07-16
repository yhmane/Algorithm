package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hwang-yunho on 2019-07-14
 * @project Algorithm
 */
public class Hwang1912 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp  = new int[N];

        String[] input = br.readLine().split(" ");

        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(input[i]);

        int max = arr[0];
        dp[0] = arr[0];
        for(int i = 1; i < N; i++) {
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }

}