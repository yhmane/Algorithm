package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hwang-yunho on 2019-07-11
 * @project Algorithm
 */
public class Hwang11722 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");

        int[] arr = new int[N];
        int[] dp  = new int[N];
        for(int i =0; i<N; i++) {
            arr[i] = Integer.parseInt(num[i]);
        }

        int max = 1;
        for(int i=0; i<N; i++) {
            dp[i]=1;
            for(int j=0; j<i; j++) {
                if(arr[i] < arr[j] && dp[i] < dp[j] + 1) dp[i] = dp[j] + 1;
            }
            if(max < dp[i]) max =dp[i];
        }

        System.out.print(max);
    }
}
