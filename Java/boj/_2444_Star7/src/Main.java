import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int n = 0; n < 2*N-1; n++){
            if(n < N){
                for(int i = N; i > n+1; i--){
                    System.out.print(" ");
                }
                for(int i = 0; i < 2*(n+1)-1; i++){
                    System.out.print("*");
                }
            }else{
                for(int i = 0; i < n-N+1; i++){
                    System.out.print(" ");
                }
                for(int i = 2*(2*N-1-n)-1; i > 0; i--){
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}
