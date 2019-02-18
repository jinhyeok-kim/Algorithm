import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] dp = new int[1001][1001];

        char[] A = br.readLine().toCharArray();
        char[] B = br.readLine().toCharArray();


        for(int a = 0; a < A.length; a++){
            for(int b = 0; b < B.length; b++){
                if(A[a] == B[b]){
                    dp[a+1][b+1] = dp[a][b] + 1;
                }else{
                    dp[a+1][b+1] = Math.max(dp[a][b+1], dp[a+1][b]);
                }
            }
        }

        
        System.out.println(dp[A.length][B.length]);
    }
}
