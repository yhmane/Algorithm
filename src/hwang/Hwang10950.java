package hwang;

import java.io.*;

public class Hwang10950 {

    static int cnt;
    static String[] input;
    public Hwang10950() {}
    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder  sb = new StringBuilder();

        cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            input = br.readLine().split(" ");
            sb.append(Integer.parseInt(input[0]) + Integer.parseInt(input[1]))
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}