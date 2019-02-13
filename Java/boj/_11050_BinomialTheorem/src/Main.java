import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        dp = new int[11][11];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        bw.write(combination(N,K) + "\n");

        bw.flush();
        bw.close();

    }

    private static int combination(int n, int r) {
        if(n == r || r == 0) return 1;

        dp[n][r] = combination(n-1, r-1) + combination(n-1,r);
        return dp[n][r];
    }
}
