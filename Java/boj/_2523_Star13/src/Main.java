import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int n = 0; n < 2*N-1; n++){
            if(n < N){
                for(int i = 0; i <= n; i++){
                    System.out.print("*");
                }
            }else{
                for(int i = n-N; i < N-1; i++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
