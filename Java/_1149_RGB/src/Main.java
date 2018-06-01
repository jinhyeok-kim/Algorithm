import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[][] house = new int[N][3];

        int[][] dp = new int[3][N];

        for(int n = 0; n < N; n++){
            for(int i =0; i < 3; i++){
                house[n][i] = scan.nextInt();
            }
        }

        dp[0][0] = house[0][0];
        dp[1][0] = house[0][1];
        dp[2][0] = house[0][2];

        for(int i = 1; i < N; i++){
            dp[0][i] = min(house[i][0]+ dp[1][i-1], house[i][0]+ dp[2][i-1]) ;
            dp[1][i] = min(house[i][1] + dp[0][i-1], house[i][1] + dp[2][i-1]);
            dp[2][i] = min(house[i][2]+ dp[0][i-1], house[i][2]+ dp[1][i-1]) ;
        }
        System.out.println(min(dp[0][N-1], dp[1][N-1], dp[2][N-1]));


    }

    static int min(int a, int b, int c){
        int result = (a < b)? a: b;
        return (c < result) ? c: result;
    }

    static int min(int a, int b){
        if(a > b){
            return b;
        }
        else{
            return a;
        }
    }

}
