package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-07-05.
 */
public class Hwang11055 {
    public static void main(String[] args) throws IOException {

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));

        int      arrCnt = Integer.parseInt(br.readLine());
        int[]    arr    = new int[arrCnt];
        int[]    dp     = new int[arrCnt];
        String[] input  = br.readLine().split(" ");

        for(int i=0; i<arrCnt; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int max=1; dp[0]=arr[0];
        for(int i=1; i<arrCnt; i++) {
            dp[i]=arr[i];
            for(int j=0; j<i; j++) {
                if(arr[i]>arr[j] && dp[i]<dp[j] + arr[i]) {
                    dp[i]=dp[j]+arr[i];
                }
            }
            if(max<dp[i]) {
                max = dp[i];
            }
        }
        System.out.print(max);
    }
}
