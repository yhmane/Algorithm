package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hwang-yunho on 2019-08-03
 * @project Algorithm
 */
public class Hwang10872 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int tot = 1;
        for(int i = N; i > 1; i --) {
            tot *= i;
        }
        System.out.println(tot);
    }
}
