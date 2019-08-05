package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author hwang-yunho on 2019-08-02
 * @project Algorithm
 */
public class Hwang1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int   N     = Integer.parseInt(br.readLine());
        int[] arr   = new int[N];
        int   total = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(isPrime(arr[i])) { total++; }
        }
        System.out.println(total);
    }

    private static boolean isPrime(int num) {

        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return num > 1 ? true : false ;
    }
}
