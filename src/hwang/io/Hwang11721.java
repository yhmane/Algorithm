package hwang.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hwang11721 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int cnt = input.length();

        System.out.print(input.charAt(0));
        for (int i = 1; i < cnt; i++) {
            if (i%10 == 0) {
                System.out.print("\n");
            }
            System.out.print(input.charAt(i));
        }

    }
}
