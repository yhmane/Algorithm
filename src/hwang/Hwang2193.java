package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-07-01.
 */
public class Hwang2193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int    ans = Integer.parseInt(br.readLine());
        long[] num = new long[ans+1];

        num[1]=1;

        for(int i=2; i<=ans; i++) {
            num[i] = num[i-1] + num[i-2];
        }

        System.out.println(num[ans]);
    }
}
