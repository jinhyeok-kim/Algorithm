import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int[] balloon = new int[N+1];
        int b = 1;


        while(st.hasMoreTokens()){
            balloon[b++] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int order = 1;
        while(count != N) {
            System.out.print(order + " ");
            count++;
            int next = 0;

            if (balloon[order] > 0) {
                next = balloon[order];
                balloon[order] = 0;
                for (int i = 0; i < next; i++) {
                    if (order == N) {
                        order = 0;
                    } else {
                        order += 1;
                    }
                    if (balloon[order] == 0) {
                        i--;
                    }

                }
            } else {
                next = -balloon[order];
                balloon[order] = 0;
                for (int i = 0; i < next; i++) {
                    if (order == 0) {
                        order = N;
                    } else {
                        order -= 1;
                    }
                    if (balloon[order] == 0) {
                        i--;
                    }
                }
            }
        }





    }
}
