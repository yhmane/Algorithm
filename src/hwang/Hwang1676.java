package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hwang-yunho on 2019-08-04
 * @project Algorithm
 */
public class Hwang1676 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int count = 0;
        while(num > 0) {
            num /= 5;
            count += num;
        }

        System.out.println(count);
    }
}