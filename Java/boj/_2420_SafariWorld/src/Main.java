import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long N = Long.parseLong(st.nextToken());
        Long M = Long.parseLong(st.nextToken());

        Long answer = N-M;

        if(answer>=0){
            System.out.println(answer);
        }else{
            answer *= -1;
            System.out.println(answer);
        }

    }
}
