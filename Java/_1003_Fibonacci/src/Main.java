import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int t = 0; t < T; t++){
            int N = scan.nextInt();
            int[] fib0 = new int [N+1];
            int[] fib1 = new int [N+1];

            fib0[0] = 1;
            fib1[0] = 0;
            if(N != 0) {
                fib0[1] = 0;
                fib1[1] = 1;

                if(N != 1) {
                    for (int i = 2; i < N + 1; i++) {
                        fib0[i] = fib0[i - 1] + fib0[i - 2];
                        fib1[i] = fib1[i - 1] + fib1[i - 2];
                    }
                }
            }

            System.out.println(fib0[N] + " " + fib1[N]);

        }
    }
}
