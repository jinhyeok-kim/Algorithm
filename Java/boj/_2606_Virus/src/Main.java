import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] computer;
    static boolean[] isvisited;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        computer = new ArrayList[N+1];

        for(int i = 1; i < N+1; i++){
            computer[i] = new ArrayList<>();
        }

        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            computer[a].add(b);
            computer[b].add(a);
        }

        isvisited = new boolean[N+1];


        System.out.println(bfs(1));

    }

    private static int bfs(int v) throws IOException{
        Queue<Integer> q = new LinkedList<>();
        int count = -1;
        q.add(v);
        isvisited[v] = true;

        while(!q.isEmpty()){
            v = q.poll();
//            bw.write(v + " ");
            count++;
            for(int i : computer[v]){
                if(!isvisited[i]){
                    q.add(i);
                    isvisited[i] = true;
                }
            }
        }

        return count;

    }
}
