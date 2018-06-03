import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for(int n = 0; n < N; n++){
            A[n] = scan.nextInt();
        }
        for(int n = 0; n < N; n++){
            B[n] = scan.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int S = 0;

        for(int i = 0; i < N; i++){
            S += A[i]*B[N-i-1];
        }

        System.out.println(S);

    }
}
