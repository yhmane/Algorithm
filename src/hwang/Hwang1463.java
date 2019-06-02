package hwang;

import java.io.*;

public class Hwang1463 {

    static int dp[];
    static int N;
    public Hwang1463() {}

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N     = Integer.parseInt(br.readLine());
        dp    = new int[N+1];
        dp[1] = 0;

        for(int i=2; i<=N; i++) {
            dp[i] = dp[i-1] + 1;

            if(i%2 == 0 && dp[i] > dp[i/2]+1) {
                dp[i] = dp[i/2] + 1;
            }

            if(i%3 == 0 && dp[i] > dp[i/3]+1) {
                dp[i] = dp[i/3] + 1;
            }
        }

        bw.write(Integer.toString(dp[N]));
        bw.flush();
        bw.close();
        br.close();
    }
}



