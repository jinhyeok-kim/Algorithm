import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        long[] dp = new long[N+1];

        dp[1] = 1;

        if(N>=2){
            dp[2] = 1;
        }

        if(N>2) {
            for (int i = 3; i < dp.length; i++) {
                dp[i] = dp[i-1] + dp[i-2];

            }
        }
        System.out.println(dp[N]);
    }
}
