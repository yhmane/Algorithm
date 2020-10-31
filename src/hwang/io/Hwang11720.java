package hwang.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hwang11720 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        int tot = 0;
        int cnt = Integer.parseInt(br.readLine());
        input = br.readLine();

        for (int i = 0; i < cnt; i++) {
            tot += input.charAt(i) - '0';
        }

        System.out.println(tot);
    }
}
