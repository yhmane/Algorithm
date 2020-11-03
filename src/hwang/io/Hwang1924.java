package hwang.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hwang1924 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] days = {0 , 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] input = br.readLine().split(" ");

        int tot = 0;
        int month = Integer.parseInt(input[0]);
        for (int i = 0; i < month; i++) {
            tot += days[i];
        }
        tot += Integer.parseInt(input[1]);


        System.out.println(day[tot%7]);
    }
}
