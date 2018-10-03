import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();

        int i = 0;
        for(i = 0; i < word.length; i++){
            if(word[i] != word[word.length-1-i]){
                break;
            }
        }

        if(i == word.length) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
