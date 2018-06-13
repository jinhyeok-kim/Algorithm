import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for(int c = 0; c< C; c++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] student = new int[N];
            int sum = 0;

            for(int n = 0; n < N; n++){
                student[n] = Integer.parseInt(st.nextToken());
                sum += student[n];
            }

            double averge = sum/N;

            int count = 0;

            for(int i = 0; i < N; i++){
                if(student[i]>averge){
                    count++;
                }
            }

            System.out.printf("%.3f", (double)count/N*100);
            System.out.println("%");
        }




    }
}
