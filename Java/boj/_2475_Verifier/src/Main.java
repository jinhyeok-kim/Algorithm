import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());
        int fourth = Integer.parseInt(st.nextToken());
        int fifth = Integer.parseInt(st.nextToken());

        int answer = (first*first + second*second + third*third + fourth*fourth + fifth*fifth)%10;

        System.out.println(answer);



    }
}
