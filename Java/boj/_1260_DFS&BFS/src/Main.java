import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, m, v;
    static int[][] graph;
    static boolean check[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        graph = new int[n + 1][n + 1];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        check = new boolean[n+1];
        dfs(v);
        System.out.println();
        check = new boolean[n+1];
        bfs(v);

    }

    public static void dfs(int v){
        System.out.print(v + " ");
        check[v] = true;
        for(int i = 1; i <= n; i++){
            if(graph[v][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        check[v] = true;

        while(!q.isEmpty()){
            int next = q.poll();
            System.out.print(next + " ");
            for(int i = 1; i <= n; i++){
                if(graph[next][i] == 1 && !check[i]){
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
