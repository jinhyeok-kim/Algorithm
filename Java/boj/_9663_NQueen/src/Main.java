import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int ans, N;
    static int[] col;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            col = new int[15];
            col[1] = i;
            dfs(1);
        }

        System.out.println(ans);

    }

    private static void dfs(int row) {
        if(row == N){
            ++ans;
        }else{
            for(int i = 1; i <= N; i++){
                col[row + 1] = i;
                if (isPossible(row + 1)){
                    dfs(row + 1);
                }else{
                    col[row + 1] = 0;
                }
            }
        }
        col[row] = 0;
    }

    private static boolean isPossible(int c) {

        for(int i =1; i < c; i++){
            if(col[i] == col[c] || Math.abs(col[i] - col[c]) == Math.abs(i - c)){
                return false;
            }
        }
        return true;
    }
}

//public class Main {
//    static int[] dx = {0, 0, 1, 1, 1, -1, -1, -1 };
//    static int[] dy = {1, -1, 0, 1, -1, -1, 0, 1};
//    static boolean[][] isvisited;
//    static int N;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        N = Integer.parseInt(br.readLine());
//
//        int count = 0;
//
//        for(int i = 0; i < N; i++){
//            for(int j = 0; j < N; j++){
//                isvisited = new boolean[N][N];
//                if(N == bfs(i,j)){
//                    count++;
//                }
//            }
//        }
//
//        System.out.println(count);
//
//    }
//
//    private static int bfs(int x, int y) {
//        int count = 0;
//
//            isvisited[x][y] = true;
//            count++;
//            loop(x, y);
//
//            for(int i = 0; i < N; i++){
//                for(int j = 0; j < N; j++){
//                    if(!isvisited[i][j]){
//                        count++;
//                        loop(i, j);
//                    }
//
//                }
//            }
//
//        return count;
//    }
//
//    private static void loop(int x, int y) {
//        for(int z = 0; z < 8; z++){
//            int nx = x + dx[z];
//            int ny = y + dy[z];
//
//            while(0 <= nx && 0 <=ny && nx<N && ny<N){
//
//                isvisited[nx][ny] = true;
//                nx += dx[z];
//                ny += dy[z];
//            }
//        }
//    }
//
//    private static class Pointer {
//        int x;
//        int y;
//
//        public Pointer(int i , int j){
//            x = i;
//            y = j;
//        }
//    }
//}
