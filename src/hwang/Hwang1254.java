package hwang;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author hwang-yunho on 2019. 12. 28.
 * @project Algorithm
 */
public class Hwang1254 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    static int solution(String input) {

        int len = input.length();
        for(int i = 0; i < len; i++) {
            if(isFelindrom(input.substring(i))) {
                return len + i;
            }
        }
        return len;
    }

    static boolean isFelindrom(String input) {

        int len = input.length();
        for(int i = 0; i<len/2; i++) {
            if(input.charAt(i) != input.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
