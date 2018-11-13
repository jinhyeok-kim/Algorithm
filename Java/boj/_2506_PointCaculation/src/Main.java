import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int point = 1;

        for(int n = 0; n < N; n++){
            if(Integer.parseInt(st.nextToken()) == 1){
                sum += point;
                point++;
            }else{
                point = 1;
            }
        }

        System.out.println(sum);

    }
}
