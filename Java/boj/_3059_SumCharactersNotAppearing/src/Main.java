import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for(int t = 0; t < T; t++){
            boolean[] capital = new boolean[26];

            int answer = 2015;
            char[] S = br.readLine().toCharArray();

            for(int s = 0; s < S.length; s++){
                if(S[s] >= 65 && S[s] <= 90){
                    if(!capital[S[s]-65]){
                        capital[S[s]-65] = true;
                        answer -= S[s];
                    }

                }
            }

            System.out.println(answer);

        }
    }
}
