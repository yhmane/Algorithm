package hwang;
import java.io.*;

public class Hwang10844{

    // 풀이봄
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[101][10];
        Long result = 0l;

        for(int i=1; i<10; i++) {
            dp[1][i] = 1;

            if(i==9) {
                dp[2][i] = 1;
            }else {
                dp[2][i] = 2;
            }
        }

        for(int i=3; i<=n; i++) {
            for(int j=1; j<10; j++) {
                if(j==1) {
                    dp[i][j] = (dp[i-1][j+1] + dp[i-2][j])%1000000000;
                } else if(j==9) {
                    dp[i][j] = (dp[i-1][j-1])%1000000000;
                } else {
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%1000000000;
                }
            }
        }

        for(int i=1; i<10; i++) {
            result += dp[n][i];
        }

        System.out.println(result%1000000000);
    }

}