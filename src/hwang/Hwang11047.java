package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hwang-yunho on 2019. 10. 13.
 * @project Algorithm
 */
public class Hwang11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int cnt = Integer.parseInt(input[0]);
        int tot = Integer.parseInt(input[1]);

        int[] arr = new int[cnt];
        for(int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 1000000000;
        for(int i=cnt-1; i>=0; i--) {
            int temp = tot;
            int tempCnt = 0;
            for(int j=i; j>=0; j--) {
                tempCnt = tempCnt + temp/arr[j];
                temp%=arr[j];
            }
            max = Math.min(max, tempCnt);
        }
        System.out.println(max);
    }
}
