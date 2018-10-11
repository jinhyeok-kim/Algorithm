import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        long a = 0;
        long count = 0;


        for(long i = 1; N-a != 0; i++){
            a += i;
            if(a > N){
                a = a-N;
            }
            count++;
        }

        System.out.println(count);

    }
}
