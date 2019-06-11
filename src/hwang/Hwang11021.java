package hwang;

import java.io.*;

/**
 * Created by hwang-yunho on 2019-06-10.
 */
public class Hwang11021 {

    static int cnt;
    static String[] input;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder  sb = new StringBuilder();

        cnt = Integer.parseInt(br.readLine());
        for(int i=1; i<=cnt; i++) {
            input = br.readLine().split(" ");
            sb.append("Case #" + i + ": " + (Integer.parseInt(input[0]) + Integer.parseInt(input[1])) + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
