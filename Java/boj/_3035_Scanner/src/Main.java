import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int ZR = Integer.parseInt(st.nextToken());
        int ZC = Integer.parseInt(st.nextToken());

        char[][] news = new char[R][C];

        for(int i = 0; i < R; i++){
            news[i] = br.readLine().toCharArray();
        }

        for(int i = 0; i < R; i++){
            for(int zr = 0; zr < ZR; zr++) {
                for (int j = 0; j < C; j++) {
                    for(int zc = 0; zc <ZC; zc++) {
                        System.out.print(news[i][j]);
                    }
                }
                System.out.println();
            }
        }

    }
}
