import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] sentence = br.readLine().toCharArray();
        int count = 0;
        for(int i = 0; i < sentence.length; i++){
            if(sentence[i] == 'a' || sentence[i] == 'e' ||
                    sentence[i] == 'i' || sentence[i] == 'o' ||
                    sentence[i] == 'u'){
                count++;
            }
        }

        System.out.println(count);



    }
}
