package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author hwang-yunho on 2019-08-02
 * @project Algorithm
 */
public class Hwang1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end   = Integer.parseInt(input[1]);

        for(int i = start; i <= end; i++) {
            if(isPrime(i)) { sb.append(i + "\n"); }
        }
        System.out.println(sb.toString());
    }

    private static boolean isPrime(int num) {

        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return num > 1 ? true : false ;
    }
}
