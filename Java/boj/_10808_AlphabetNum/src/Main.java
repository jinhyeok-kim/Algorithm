import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //a: 97 z : 122
        char[] S = br.readLine().toCharArray();
        int[] alphabet = new int[26];

        for(int s = 0; s < S.length; s++){
            alphabet[S[s]-97]++;
        }

        for(int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
        }


    }
}
