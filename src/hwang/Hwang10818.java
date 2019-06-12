package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-12.
 */
public class Hwang10818 {

    public static void main(String[] args) throws IOException {

        int num, min, max;
        BufferedReader br    = new BufferedReader(new InputStreamReader(System.in));
        num                  = Integer.parseInt(br.readLine());
        String[]       input = br.readLine().split(" ");

        max = min = Integer.parseInt(input[0]);

        for(int i=1; i<num; i++) {
            int cmp = Integer.parseInt(input[i]);

            if(cmp<min) min = cmp;
            else if(cmp>max) max = cmp;
        }

        System.out.println(min + " " + max);
    }
}

