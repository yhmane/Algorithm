package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author hwang-yunho on 2019-08-15
 * @project Algorithm
 */
public class Hwang2667 {

    private static boolean visited[][] = new boolean[25][25];
    private static int graph[][];
    private static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        for (int i = 0; i < N; i++) {

            String input = br.readLine();
            for(int j = 0; j < N; j++)  { graph[i][j] = input.charAt(j) - '0'; }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (graph[i][j] == (1) && !visited[i][j])  { arr.add(dfs(i, j)); }
            }
        }

        Collections.sort(arr);
        sb.append(arr.size() + "\n");
        for (int i = 0; i < arr.size(); i++) sb.append(arr.get(i) + "\n");
        System.out.println(sb.toString());
    }

    private static int dfs(int xNode, int yNode) {

        int ans = 1;
        int xxxx[] = {-1, 0, 1, 0};
        int yyyy[] = {0, -1, 0, 1};

        visited[xNode][yNode] = true;

        for (int i = 0; i < 4; i++) {

            int curX = xNode + xxxx[i];
            int curY = yNode + yyyy[i];

            if (curX >= N || curY >= N || curX < 0 || curY < 0 ) { continue; }
            if(graph[curX][curY] == 0) { continue; }
            if(visited[curX][curY])    { continue; }

            ans += dfs(curX, curY);
        }
        return ans;
    }
}
