import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] adj;
    static boolean[] isvisited;
    static BufferedWriter bw;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N+1];
        isvisited = new boolean[N+1];

        for(int i = 1; i < N+1; i++){
            adj[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adj[a].add(b);
            adj[b].add(a);
        }

        for(int i = 1; i < adj.length; i++){
            Collections.sort(adj[i]);
        }

        dfs(V);

        bw.flush();
        bw.newLine();

        isvisited = new boolean[N+1];

        bfs(V);

        bw.flush();



    }

    private static void bfs(int v) throws IOException {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(v);
        isvisited[v] = true;

        while(!queue.isEmpty()){
            v = queue.poll();
            bw.write(v + " ");
            for(int i : adj[v]){
                if(!isvisited[i]){
                    queue.add(i);
                    isvisited[i] = true;
                }
            }
        }
        

    }

    private static void dfs(int v) throws IOException {
        if(isvisited[v]) return;
        isvisited[v] = true;
        bw.write(v + " ");

        for(int i : adj[v]){
            dfs(i);
        }
    }
}
