import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();

        for(int i = 0; i < word.length; i++){
            if(word[i] < 95){
                System.out.print((char)(word[i] + 32));
            }else{
                System.out.print((char)(word[i] - 32));
            }
        }

    }
}
