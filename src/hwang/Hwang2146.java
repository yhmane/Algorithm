package hwang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


// input 10
//1 1 1 0 0 0 0 1 1 1
//1 1 1 1 0 0 0 0 1 1
//1 0 1 1 0 0 0 0 1 1
//0 0 1 1 1 0 0 0 0 1
//0 0 0 1 0 0 0 0 0 1
//0 0 0 0 0 0 0 0 0 1
//0 0 0 0 0 0 0 0 0 0
//0 0 0 0 1 1 0 0 0 0
//0 0 0 0 1 1 1 0 0 0
//0 0 0 0 0 0 0 0 0 0
// output 3
public class Hwang2146 {

    static int N;
    static int[] dy = { -1, 1, 0, 0 };
    static int[] dx = { 0, 0, -1, 1 };
    static int[][] graph;
    static int[][] boundary;
    private static boolean[][] visit;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        boundary = new int[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int chk = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visit[i][j] || graph[i][j] == 0)
                    continue;
                bfs(i, j, chk);
                chk++;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (boundary[i][j] <1)
                    continue;
                int b = bridge(i, j, boundary[i][j]);
                min = min > b? b:min;
            }
        }

        System.out.println(min);
    }

    static void bfs(int y, int x, int chk) {
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(y, x));
        visit[y][x] = true;
        boundary[y][x] = -1;
        while (!que.isEmpty()) {
            Node node = que.poll();
            int py = node.y;
            int px = node.x;

            for (int i = 0; i < 4; i++) {
                int ny = py + dy[i];
                int nx = px + dx[i];
                if (ny < 0 || ny > N - 1 || nx < 0 || nx > N - 1 || visit[ny][nx])
                    continue;
                if (graph[ny][nx] == 1) {
                    que.add(new Node(ny, nx));
                    visit[ny][nx] = true;
                    boundary[ny][nx] = -1;
                }
                if (graph[ny][nx] == 0) {
                    boundary[py][px] = chk;
                }
            }
        }
    }

    static int bridge(int y, int x, int me) {
        int[][] visit2 = new int[N][N];
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(y, x));
        visit2[y][x] = 1;
        int len = 0;
        while (!que.isEmpty()) {

            len++;
            int qSize = que.size();
            for (int q = 0; q < qSize; q++) {
                Node node = que.poll();
                int py = node.y;
                int px = node.x;

                for (int i = 0; i < 4; i++) {
                    int ny = py + dy[i];
                    int nx = px + dx[i];
                    if (ny < 0 || ny > N - 1 || nx < 0 || nx > N - 1 || visit2[ny][nx] != 0 || boundary[ny][nx] == -1 || boundary[ny][nx]==me)
                        continue;
                    if (boundary[ny][nx] != 0 && boundary[ny][nx] != -1 && boundary[ny][nx] != me) {
                        return len-1;
                    }

                    if (boundary[ny][nx] ==0) {
                        que.add(new Node(ny, nx));
                        visit2[ny][nx] = len;
                    }
                }
            }
        }
        return len;
    }

    static class Node {
        int y;
        int x;

        public Node(int y, int x) {
            super();
            this.y = y;
            this.x = x;
        }
    }
}