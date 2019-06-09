package hwang;
/**
 * Created by hwang-yunho on 2019-06-09.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Hwang2751 {

    static int N ;
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        N                  = Integer.parseInt(br.readLine());
        List<Integer> list = new LinkedList<Integer>();

        while(N-->0) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for(int i : list) {
            bw.write(Integer.toString(i)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}