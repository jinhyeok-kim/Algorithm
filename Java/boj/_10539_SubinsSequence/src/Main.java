import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] Bsequence = new int[N];
        int i = 0;
        while(st.hasMoreTokens()){
            Bsequence[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        int sum = 0;
        for(i = 0; i < N; i++){
            System.out.print(Bsequence[i]*(i+1) - sum + " ");
            sum = Bsequence[i]*(i+1);
        }
    }
}
