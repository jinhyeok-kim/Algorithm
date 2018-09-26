import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = 100;
            int max = 0;
            while(st.hasMoreTokens()){
                int xi = Integer.parseInt(st.nextToken());
                if(xi < min){
                    min = xi;
                }
                if(max < xi){
                    max = xi;
                }
            }

            System.out.println((max-min)*2);

        }

    }
}
