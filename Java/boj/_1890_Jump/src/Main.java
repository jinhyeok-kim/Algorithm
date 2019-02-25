import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[N][N];
        long[][] dp = new long[N][N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = 1;

        for(int i = 0; i < N; i++){
            for(int j = 0 ; j < N; j++){
                if(board[i][j] != 0) {
                    if (i + board[i][j] < N) {
                        dp[i + board[i][j]][j] += dp[i][j];
                    }
                    if (j + board[i][j] < N) {
                        dp[i][j + board[i][j]] += dp[i][j];
                    }
                }
            }
        }

        System.out.println(dp[N-1][N-1]);



    }
}
