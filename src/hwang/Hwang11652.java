package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hwang-yunho on 2019-07-22
 * @project Algorithm
 */
public class Hwang11652 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  N      = Integer.parseInt(br.readLine());
        int  maxCnt = 1;
        long ans    = 0;

        Map<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {

            long num = Long.parseLong(br.readLine());

            if(map.containsKey(num)) {

                int tempCnt = map.remove(num) + 1;

                map.put(num, tempCnt);
                if(maxCnt == tempCnt) ans = ans < num ? ans : num;
                else if(maxCnt < tempCnt) {
                    maxCnt = tempCnt;
                    ans = num;
                }
            } else {
                map.put(num, 1);
                if(map.size() == 1) ans = num;
                if(maxCnt == 1) ans = ans < num ? ans : num;
            }
        }
        System.out.println(ans);
    }
}