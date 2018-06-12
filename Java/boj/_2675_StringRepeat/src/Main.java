import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int repeat = Integer.parseInt(st.nextToken());
            String sentence = st.nextToken();
            char[] word = sentence.toCharArray();

            for(int i = 0; i< word.length; i++){
                for(int j = 0; j < repeat; j++){
                    System.out.print(word[i]);
                }
            }
            System.out.println();

        }
    }
}
