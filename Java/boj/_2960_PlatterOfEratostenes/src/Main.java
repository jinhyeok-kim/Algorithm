import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] num = new int[N+1];
        int answer = 0;

        for(int i = 2; i <= N; i++){
            num[i] = 1;
        }

        int count = 0;

        while(count != K) {
            int i = 2;
            for (i = 2; i <= N; i++) {
                if (num[i] != 0) {
                    break;
                }
            }

            for (int j = i, k = 1; j <= N; j = i*k  ) {
                if (num[j] != 0) {
                    num[j] = 0;

                    count++;

                    if (count == K) {
                        answer = j;
                        break;
                    }

                }
                k++;
            }
        }

        System.out.println(answer);

    }
}
