import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        for(int i =0; i < 3; i++){
            num *= Integer.parseInt(br.readLine());
        }

        int[] A = new int[10];

        while(num != 0){
            A[num%10]++;
            num /= 10;
        }

        for(int i =0; i < 10; i++){
            System.out.println(A[i]);
        }
    }
}
