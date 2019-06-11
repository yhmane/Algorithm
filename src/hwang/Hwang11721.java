package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-11.
 */
public class Hwang11721 {

    static int cnt;
    static String input;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input             = br.readLine();
        cnt               = input.length();

        System.out.print(input.charAt(0));
        for(int i=1; i<cnt; i++) {
            if(i%10==0) {
                System.out.print("\n");
            }
            System.out.print(input.charAt(i));
        }
    }
}