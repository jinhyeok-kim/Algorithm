import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        String[] suffix = new String[sentence.length()];

        for(int s = 0; s < sentence.length(); s++){
            suffix[s] = sentence.substring(s, sentence.length());
        }

        Arrays.sort(suffix);

        for(int s = 0; s < sentence.length(); s++){
            System.out.println(suffix[s]);
        }

    }
}
