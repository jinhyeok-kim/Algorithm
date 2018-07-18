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
            for(int j = 0; j < n*2+1; j++){
                if(j%2 == 0) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
