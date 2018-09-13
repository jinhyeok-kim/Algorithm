import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int n =0; n < N; n++){
            int his = Integer.parseInt(br.readLine());
            for(int h =0; h < his; h++){
                System.out.print("=");
            }
            System.out.println();
        }

    }
}
