import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int n = 0; n < N; n++){
            for(int i = 0; i < n; i++){
                System.out.print(" ");
            }
            for(int j = 2*(N-n)-1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
