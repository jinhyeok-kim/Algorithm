import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 0; i < N; i++){
            String word = br.readLine();
            char[] word_alpha = word.toCharArray();

            int[] alpha = new int[26];

            if(word_alpha.length != 1) {

                for (int j = 1; j < word_alpha.length; j++) {
                    if (((int) word_alpha[j - 1] - 97) != ((int) word_alpha[j] - 97)) {
                        if (alpha[(int) word_alpha[j] - 97] == -1) {
                            count--;
                            break;
                        }
                        alpha[(int) word_alpha[j - 1] - 97] = -1;
                    }

                }
            }
            count++;

        }

        System.out.println(count);


    }
}
