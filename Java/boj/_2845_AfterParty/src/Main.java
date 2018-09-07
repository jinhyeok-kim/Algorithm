import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int particifate = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for(int i = 0; i < 5; i++){
            int news = Integer.parseInt(st1.nextToken());
            System.out.print(news - particifate + " ");
        }

    }
}
