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
        int max = 0;
        for(int i = 1; i < N; i++){
            if(i == 1){
                S[i] = Max(A[i], A[i] + S[i-1]);
            }
            else {
                S[i] = Max(A[i], A[i] + S[i - 1], A[i] + A[i - 1]);
            }
            if(S[i]>max){
                max = S[i];
            }
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

    static int Max(int a, int b, int c) {
//        return (a>b)&&(a>c)?a:(c>b?c:b);
        int result2 = (a>b)? a: b;
        return c > result2? c: result2;
    }
}
