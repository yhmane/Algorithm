package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hwang1000 {

    static String[] input;
    public Hwang1000() {}
    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input             = br.readLine().split(" ");

        System.out.println(Integer.parseInt(input[0])+Integer.parseInt(input[1]));

    }
}



