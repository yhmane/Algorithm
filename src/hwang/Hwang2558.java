package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang2558 {

    static int[] num = new int[2];
    public Hwang2558() {}
    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num[0]            = Integer.parseInt(br.readLine());
        num[1]            = Integer.parseInt(br.readLine());

        System.out.println(num[0] + num[1]);

    }
}