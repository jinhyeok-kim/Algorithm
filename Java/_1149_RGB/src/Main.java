import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[][] house = new int[N][3];

        int[] dp = new int[N];

        for(int n = 0; n < N; n++){
            for(int i =0; i < 3; i++){
                house[n][i] = scan.nextInt();
            }
        }

        int idx = index(house[0][0], house[0][1], house[0][2],
                dp[0] = min(house[0][0], house[0][1], house[0][2]));

        for(int i = 1; i < N; i++){
            if (idx == index(house[i][0], house[i][1], house[i][2],
                    dp[i] = min(house[i][0], house[i][1], house[i][2])))
            {
                house[i][idx] = 10000;
                idx = index(house[i][0], house[i][1], house[i][2],
                        dp[i] = min(house[i][0], house[i][1], house[i][2]));
            }

            dp[i] += dp[i-1];
        }

        System.out.println(dp[N-1]);

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

    static int index(int a, int b, int c, int value){
        if(a == value){
            return 0;
        }
        else if( b == value){
            return 1;
        }
        else{
            return 2;
        }
    }
}
