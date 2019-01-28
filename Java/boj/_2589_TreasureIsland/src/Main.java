import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] isvisited;
    static char[][] map;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int row;
    static int col;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        int maxDis = 0;

        map = new char[row][col];

        for(int i = 0; i < row; i++){
            map[i] = br.readLine().toCharArray();
        }

//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < col; j++){
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(map[i][j] == 'L') {
                    isvisited = new boolean[row][col];
                    Point pt = new Point(i, j);

                    int tempMax = bfs(pt);

                    if (maxDis < tempMax) {
                        maxDis = tempMax;
                    }
                }

            }
        }

        System.out.println(maxDis);

    }

    private static int bfs(Point pt) {
        Queue<Point> q = new LinkedList<>();
        int[][] DIST = new int[row][col];
        int maxDis = 0;

        q.add(pt);

        while(!q.isEmpty()){
            Point curPoint = q.poll();
            int x = curPoint.x;
            int y = curPoint.y;

            isvisited[x][y] = true;

            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(0 <= nx && 0 <= ny && nx < row && ny < col){
                    if(!isvisited[nx][ny] && map[nx][ny] != 'W'){
                        DIST[nx][ny] = DIST[x][y] + 1;
                        curPoint = new Point(nx,ny);
                        q.add(curPoint);
                        isvisited[nx][ny] = true;

                        if(maxDis < DIST[nx][ny]){
                            maxDis = DIST[nx][ny];
                        }
                    }
                }
            }
        }
        return maxDis;
    }

    private static class Point {
        int x;
        int y;
        public Point(int i, int j) {
            x = i;
            y = j;
        }
    }
}
