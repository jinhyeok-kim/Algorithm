import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] A = new int[N];
        int[] S = new int[N];

        for(int n = 0; n < N; n++){
            A[n] = scan.nextInt();
        }

        S[0] = A[0];
        int max = A[0];
        for(int i = 1; i < N; i++){

            S[i] = Max(A[i], A[i] + S[i-1]);
            max = Max(max, S[i]);
        }

        System.out.println(max);

    }

    static int Max(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
}
