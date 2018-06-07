import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        char[] word = N.toCharArray();
        int[] alpha = new int[26];


        //소문자 97 ~ 122, 대문자 65 ~90
        //알파벳 26개
        for (int i = 0; i < word.length; i++) {
            if ((int) word[i] < 95) {
                alpha[word[i] - 65]++;
            } else {
                alpha[word[i] - 97]++;
            }
        }

        int max = 0;
        int temp = 0;
        for (int i = 0; i < alpha.length; i++) {
            if (max <= alpha[i]) {
                max = alpha[i];
                temp = i;
            }
        }

        for (int i = 0; i < alpha.length; i++) {
            if (max == alpha[i] && i != temp) {
                System.out.println("?");
                System.exit(0);
            }
        }

        System.out.println((char) (temp + 65));
    }
}
