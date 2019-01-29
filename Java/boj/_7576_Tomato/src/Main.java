import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] isvisited;
    static int[][] box;
    static Queue<Pointer> queue;
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        isvisited = new boolean[N][M];
        box = new int[N][M];

        for(int i =0 ; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < M; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        queue = new LinkedList<>();

        for(int i =0 ; i < N; i++){
            for(int j = 0; j < M; j++){
                if(box[i][j] == 1){
                    Pointer pt = new Pointer(i,j);
                    queue.add(pt);
                }
            }
        }
        int date = bfs();


        for(int i =0 ; i < N; i++){
            for(int j = 0; j < M; j++){
                if(box[i][j] == 0 && !isvisited[i][j]){
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }


        System.out.println(date);


    }

    private static int bfs() {
        int[][] DIST = new int[N][M];
        int dis = 0;

        while(!queue.isEmpty()){
            Pointer cur = queue.poll();
            int x = cur.x;
            int y = cur.y;
            isvisited[x][y] = true;

            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(0 <= nx && 0 <= ny && nx <N && ny <M){
                    if(!isvisited[nx][ny] && box[nx][ny] == 0){
                        DIST[nx][ny] = DIST[x][y] + 1;
                        isvisited[nx][ny] = true;
                        cur = new Pointer(nx,ny);
                        queue.add(cur);

                        if(dis < DIST[nx][ny]){
                            dis = DIST[nx][ny];
                        }
                    }
                }
            }

        }
        return dis;
    }

    private static class Pointer {
        int x;
        int y;

        public Pointer(int i, int j) {
            x = i;
            y = j;
        }
    }
}
