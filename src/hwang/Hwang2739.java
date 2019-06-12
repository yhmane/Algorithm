package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-11.
 */
public class Hwang2739 {

    static int multiple;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();
        multiple          = Integer.parseInt(br.readLine());

        for(int i=1; i<10; i++) {
            //
            sb.append(multiple +  " * " + i + " = " + (multiple*i))
                    .append("\n");
        }

        System.out.print(sb.toString());
    }
}
