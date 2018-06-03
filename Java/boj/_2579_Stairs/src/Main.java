import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] stair = new int[N+1];
        int[] dp1 = new int[N+1];
        int[] dp2 = new int[N+1];

        for(int n = 1; n <= N; n++){
            stair[n] = scan.nextInt();
        }

        dp1[1] = stair[1];
        dp2[1] = 0;

        dp1[2] = stair[2];
        dp2[2] = dp1[1] + stair[2];

        for(int i = 3; i <= N; i++){
            dp1[i] = max(dp2[i-2],dp1[i-2]) + stair[i];
            dp2[i] = dp1[i-1] + stair[i];
        }

        System.out.println(max(dp1[N],dp2[N]));



    }
    static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}


