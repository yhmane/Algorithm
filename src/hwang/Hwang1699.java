package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hwang-yunho on 2019-07-14
 * @project Algorithm
 */
public class Hwang1699 {

    // 예외 케이스 12 ...
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long t = N/2;
        long tot = 0l;
        int cnt = 0;
        for(long i = t; i>0; i--) {
            long temp = 0l;
            temp += i * i;
            if(N >= temp && N >= tot + temp) {
                tot+=temp;
                cnt++;
                i++;
            }
        }

        if(N == 1) cnt = 1;
        System.out.println(cnt);
    }
}
