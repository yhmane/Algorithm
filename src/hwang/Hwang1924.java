package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by hwang-yunho on 2019-06-12.
 */
public class Hwang1924 {

    public static void main(String[] args) throws IOException {

        BufferedReader   br    = new BufferedReader(new InputStreamReader(System.in));
        String[]         input = br.readLine().split(" ");

        int[]    days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day  = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
        int    month  = Integer.parseInt(input[0]);

        int tot = 0;
        for(int i=0; i<month; i++) {
            tot += days[i];
        }
        tot+= Integer.parseInt(input[1]);
        System.out.print(day[tot%7]);
    }
}
