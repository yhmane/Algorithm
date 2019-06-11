package hwang;

import java.io.*;

/**
 * Created by hwang-yunho on 2019-06-10.
 */
public class Hwang11718 {

    static String input;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();

        while((input = br.readLine())!= null) {
            sb.append(input).
                    append("\n");
        }
        br.close();
        System.out.println(sb.toString());
    }
}
