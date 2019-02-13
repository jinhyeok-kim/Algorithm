import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        dp = new int[1001][1001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        bw.write(combination(N,K) + "\n");

        bw.flush();
        bw.close();

    }

    private static int combination(int n, int r) {
        if(n == r || r == 0) return 1;
        if(dp[n][r] > 0) return dp[n][r];

        dp[n][r] = (combination(n-1, r-1)+ combination(n-1,r))%10007;
        return dp[n][r];
    }
}
