import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int n = 0 ; n < N; n++){
            char[] sentence = br.readLine().toCharArray();

            for(int i = 0; i < sentence.length; i++){
                if(i == 0 &&sentence[0] > 90){
                        System.out.print((char)(sentence[0]-32));
                }else {
                    System.out.print((char) sentence[i]);
                }
            }
            System.out.println();
        }

    }
}
