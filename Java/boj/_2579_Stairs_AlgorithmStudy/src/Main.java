import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] stair = new int[N+1];
        int[] dp1 = new int[N+1];
        int[] dp2 = new int[N+1];

        for(int i = 1; i <= N; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp1[1] = stair[1];
        dp2[1] = 0;

        dp1[2] = stair[2];
        dp2[2] = dp1[1] + stair[2];

        for(int i = 3; i <= N; i++){
            dp1[i] = Math.max(dp2[i-2], dp1[i-2]) + stair[i];
            dp2[i] = dp1[i-1] + stair[i];
        }



    }
}
