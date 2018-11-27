import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int n = 0; n < N; n++){
            for(int i = n; i < N-1; i++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(n == N-1){
                for(int j = 0; j <= 2*n-1; j++){
                    System.out.print("*");
                }

            }else {
                for (int j = 0; j < 2 * n - 1; j++) {
                    System.out.print(" ");
                }
                if (n == 0) {
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
