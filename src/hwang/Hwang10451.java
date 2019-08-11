package hwang;

import java.io.*;
import java.util.*;

public class Hwang10451 {

    private static int[] adjacent;
    private static boolean[] visited;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {

            int total = 0;
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            visited = new boolean[N + 1];
            adjacent = new int[N + 1];

            for (int n = 1; n <= N; n++) {
                adjacent[n] = Integer.parseInt(st.nextToken());
            }

            for (int n = 1; n <= N; n++) {
                if (!visited[n] && dfs(n) == n) {
                    total++;
                }
            }
            bw.write(total + "\n");
        }
        bw.close();

    }

    static int dfs(int node) {

        visited[node] = true;
        int next = adjacent[node];
        if (!visited[node]) {
            return dfs(node);
        } else {
            return next;
        }

    }

}