import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st =new StringTokenizer(br.readLine());

        int max = 0;
        int min = 0;

        for(int n = 0; n < N; n++){
            int temp = Integer.parseInt(st.nextToken());

            if(n == 0){
                min = temp;
                max = temp;
            }

            if(temp > max){
                max = temp;
            }

            if(temp < min){
                min = temp;
            }

        }

        System.out.println(min + " " + max);

    }
}
