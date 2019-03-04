import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] map = new int[M][N];
        long[][] dp = new long[M][N];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = 1;

        for(int i = 0; i < M; i++){
            for(int j = 0 ; j < N; j++){
                if(map[i][j] != 0) {
                    if(i + 1 < M){
                        if(map[i+1][j] < map[i][j]){
                            dp[i+1][j] += dp[i][j];
                        }
                    }

                    if(j + 1 < N){
                        if(map[i][j+1] < map[i][j]){
                            dp[i][j+1] += dp[i][j];
                        }
                    }

                    if(i -1 > 0){
                        if(map[i-1][j] < map[i][j]){
                            dp[i-1][j] += dp[i][j];
                        }
                    }

                    if(j - 1 > 0){
                        if(map[i][j-1] < map[i][j]){
                            dp[i][j-1] += dp[i][j];
                        }
                    }
//                    if (i + map[i][j] < N) {
//                        dp[i + map[i][j]][j] += dp[i][j];
//                    }
//                    if (j + map[i][j] < N) {
//                        dp[i][j + map[i][j]] += dp[i][j];
//                    }

                }
            }
        }

        bw.write(dp[M-1][N-1] +"\n");
        bw.flush();
        bw.close();



    }
}
