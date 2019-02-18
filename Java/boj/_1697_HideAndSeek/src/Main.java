import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dp;
    static boolean[] isvisited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        dp = new int[200002];
        isvisited = new boolean[200002];

        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;
        }

        dp[N] = 0;
        BFS(N);

        bw.write(dp[K] + "\n");
        bw.close();

    }

    private static void BFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);

        while(!queue.isEmpty()){
            n = queue.poll();
            isvisited[n] = true;

            if(n*2 < dp.length){
                if(dp[n*2] == -1 || dp[n*2] > dp[n] + 1){
                    if(!isvisited[n*2]) {
                        dp[n*2] = dp[n] + 1;
                        queue.add(n * 2);
                    }
                }
            }
            if(n-1 >= 0){
                if(dp[n-1] == -1 || dp[n-1] > dp[n] + 1) {
                    if(!isvisited[n-1]) {
                        dp[n-1] = dp[n] +1;
                        queue.add(n - 1);
                    }

                }
            }
            if(n+1 < dp.length){
                if(dp[n+1] == -1 || dp[n+1] > dp[n] +1){
                    if(!isvisited[n + 1]) {
                        dp[n+1] = dp[n] +1;
                        queue.add(n + 1);
                    }
                }
            }
        }
    }
}
