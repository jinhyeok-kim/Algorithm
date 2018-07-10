import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int train = 0;
        int answer = 0;
        for(int i = 0; i < 4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            train -= Integer.parseInt(st.nextToken());
            train += Integer.parseInt(st.nextToken());
            answer = max(answer, train);
        }

        System.out.println(answer);
    }


    static int max(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}