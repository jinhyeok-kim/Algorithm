import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[][] map;
    static boolean check[][];
    static int countCheck[][];
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n + 1][m + 1];

        for(int i = 1; i < n+1; i++){
            String line = br.readLine();
            for(int j = 1; j <= line.length(); j++){
                map[i][j] = (line.charAt(j-1) - 48);
            }
        }

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }


        check = new boolean[n+1][m+1];
        countCheck = new int[n+1][m+1];
        bfs(1,1);
//        dfs(1);
//        System.out.println();
//        check = new boolean[n+1];
//        bfs(1);

    }

//    public static void dfs(int v){
//        System.out.print(v + " ");
//        check[v] = true;
//        for(int i = 1; i <= n; i++){
//            if(graph[v][i] == 1 && !check[i]){
//                dfs(i);
//            }
//        }
//    }

    public static void bfs(int x, int y){
        Queue<Point> q = new LinkedList<Point>();
        q.add(new Point(x, y));
        check[x][y] = true;
        countCheck[x][y] = 1;

        if(map[x+1][y] == 1 && !check[x+1][y]){

        }

//        while(!q.isEmpty()){
//            int a = q.poll().x;
//            int b = q.poll().y;
//
//            for(int i = 1; i <= n; i++){
//                if(graph[next][i] == 1 && !check[i]){
//                    q.add(i);
//                    check[i] = true;
//                }
//            }
//        }
    }
}
