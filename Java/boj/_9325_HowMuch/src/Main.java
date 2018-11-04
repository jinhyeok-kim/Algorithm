import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            int price = Integer.parseInt(br.readLine());

            int option = Integer.parseInt(br.readLine());

            for(int i = 0; i < option; i++){
                StringTokenizer st =new StringTokenizer(br.readLine());

                int num = Integer.parseInt(st.nextToken());

                price += num * Integer.parseInt(st.nextToken());
            }

            System.out.println(price);
        }

    }
}
