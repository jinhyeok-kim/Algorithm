import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static char[][] map;
    static boolean[][] isvisited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int danjiNum = 0;

        map = new char[N][N];

        for(int i = 0; i <N; i++){
            map[i] = br.readLine().toCharArray();
        }

        isvisited = new boolean[N][N];

        ArrayList<Integer> house = new ArrayList<>();

        for(int i =0 ; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!isvisited[i][j] && map[i][j] == '1'){
                    Pointer pt = new Pointer(i,j);
                    house.add(bfs(pt));
                    danjiNum++;

                }
            }
        }

        System.out.println(danjiNum);

//        for(int i : house){
//            System.out.println(house.indexOf(i));
//        }
        Collections.sort(house);
        for(int i =0 ; i < house.size(); i++){
            System.out.println(house.get(i));
        }


    }

    private static int bfs(Pointer pt) {
        Queue<Pointer> q = new LinkedList<>();
        int count =0;

        q.add(pt);

        while(!q.isEmpty()){
            Pointer cur = q.poll();
            int x = cur.x;
            int y = cur.y;
            count++;
            isvisited[x][y] = true;

            for(int i = 0; i <4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(0 <= nx && 0 <= ny && nx < N && ny <N){
                    if(!isvisited[nx][ny] && map[nx][ny] == '1'){
                        cur = new Pointer(nx, ny);
                        q.add(cur);
                        isvisited[nx][ny] = true;
                    }
                }
            }

        }
        return count;
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
