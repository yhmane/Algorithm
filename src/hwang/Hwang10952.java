package hwang;

import java.io.*;


public class Hwang10952 {

    static String input;
    static String[] numArr;
    public Hwang10952() {}
    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder  sb = new StringBuilder();

        while((input = br.readLine()) != null) {
            numArr = input.split(" ");
            if(Integer.parseInt(numArr[0]) == 0 && Integer.parseInt(numArr[1]) == 0) break;
            sb.append(Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1]))
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}