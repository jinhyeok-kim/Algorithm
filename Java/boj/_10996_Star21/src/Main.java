import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int n = 0; n < N; n++){
                    for(int j = 0; j < N/2 + N%2; j++){
                        System.out.print("* ");
                    }
                System.out.println();
                    for(int j = 0; j < N/2; j++){
                        System.out.print(" *");
                    }
            System.out.println();
        }
    }
}
