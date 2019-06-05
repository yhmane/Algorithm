package hwang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Hwang10951 {

    static String input;
    static String[] numArr;
    public Hwang10951() {}
    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder  sb = new StringBuilder();

        while((input = br.readLine()) != null) {
            numArr = input.split(" ");
            sb.append(Integer.parseInt(numArr[0]) + Integer.parseInt(numArr[1]))
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}